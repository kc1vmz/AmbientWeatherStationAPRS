package com.kc1vmz.ambientweatheragent.queue;

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

import java.util.concurrent.ArrayBlockingQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.kc1vmz.ambientweatheragent.objects.CWOPReport;

@Service
public class CWOPReportQueue {

    private static final Logger logger = LogManager.getLogger(CWOPReportQueue.class);
    private static final int QUEUE_SIZE=10;

    private ArrayBlockingQueue<CWOPReport> queue = null;
    private boolean stop = false;

    private void initializeQueue() {
        if (queue == null) {
            queue = new ArrayBlockingQueue<>(QUEUE_SIZE);
        }
    }
    public synchronized ArrayBlockingQueue<CWOPReport> getQueue() {
        initializeQueue();
        return queue;
    }
    public synchronized void addCWOPReport(CWOPReport obj) {
        if (!stayRunning()) {
            return;
        }
        ArrayBlockingQueue<CWOPReport> initializedQueue = getQueue();
        try {
            initializedQueue.add(obj);
        } catch (IllegalStateException e) {
            logger.error("IllegalStateException adding to queue", e);
            shutdown();
        } catch (Exception e) {
            logger.error("Exception adding to queue", e);
        }
    }
    public boolean stayRunning() {
        return !stop;
    }
    public void shutdown() {
        stop = true;
    }
}
