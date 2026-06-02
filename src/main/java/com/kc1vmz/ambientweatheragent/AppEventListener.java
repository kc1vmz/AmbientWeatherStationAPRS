package com.kc1vmz.ambientweatheragent;

/*
    Copyright (c) 2026 John Rokicki KC1VMZ

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
    
    http://www.kc1vmz.com
*/

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.context.event.StartupEvent;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.concurrent.ArrayBlockingQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kc1vmz.ambientweatheragent.accessors.CWOPReportSenderTCPIP;
import com.kc1vmz.ambientweatheragent.objects.CWOPReport;
import com.kc1vmz.ambientweatheragent.queue.CWOPReportQueue;

@Singleton
public class AppEventListener implements ApplicationEventListener<StartupEvent> { 
    private static final Logger logger = LogManager.getLogger(AppEventListener.class);
    @Inject
    private CWOPReportQueue cwopReportQueue;
    @Inject
    private CWOPReportSenderTCPIP cwopReportSenderTCPIP;


    @Override
    public void onApplicationEvent(StartupEvent event) {
        // create queue and event sender thread
        startSenderThread();
    }

    private void startSenderThread() {
        new Thread(null, () -> {
            while (true) {
                boolean run = true;
                boolean shutdownok = false;
                ArrayBlockingQueue<CWOPReport> queue = cwopReportQueue.getQueue();
                CWOPReport cwopReport = null;
                while (run) {
                    try {
                        shutdownok = false;
                        cwopReport = queue.take();
                        cwopReportSenderTCPIP.sendToCWOP(cwopReport);
                        run = cwopReportQueue.stayRunning();
                        if (!run) {
                            // if told to shutdown, that's ok
                            shutdownok = true;
                        }
                    } catch (InterruptedException e) {
                        logger.error("InterruptedException caught processing report", e);
                        run = false;
                        shutdownok = true;
                    } catch (Exception e) {
                        logger.error("Exception caught processing report", e);
                    }
                }
                if (!shutdownok) { 
                    logger.error("Unexpected end of processing loop - go again");
                    if (cwopReport != null) {
                        logger.error("Report in question: "+cwopReport.getTime().toString());
                    }
                } else {
                    logger.info("End of processing loop");
                    break;
                }
            }
        }, "CWOPReportSenderThread").start();
    }

}
