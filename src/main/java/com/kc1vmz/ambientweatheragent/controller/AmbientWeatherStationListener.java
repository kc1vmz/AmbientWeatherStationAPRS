package com.kc1vmz.ambientweatheragent.controller;

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

import java.util.Map;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kc1vmz.ambientweatheragent.accessors.AmbientWeatherStationReportProcessor;
import com.kc1vmz.ambientweatheragent.objects.AmbientWeatherStationProperties;
import com.kc1vmz.ambientweatheragent.queue.CWOPReportQueueReader;


/*
 * Ambient Weather Station customization is configured to send AmbientWeather format data to this endpoint.
 * Configure weather station to send data every 10 minutes to yourIP:yourPort/report?fix=1
 * Ambient Weather stations will send data starting with an &, the path needs a starting query param to make it work properly.
 * If you change the "fix=1" then the variable "fix" needs to be altered in the AmbientWeatherStationProperties object definition.
 */

@RestController
public class AmbientWeatherStationListener {

    @Autowired 
    private AmbientWeatherStationReportProcessor ambientWeatherStationReportProcessor;
    @Autowired
    private CWOPReportQueueReader cwopReportQueueReader;
    private static final Logger logger = LogManager.getLogger(AmbientWeatherStationListener.class);
    private boolean threadStarted = false;

    // https://ambientweather.com/faqs/question/view/id/1857/
    @GetMapping("/report")  // "/{?values*}"
    public String dynamicSearch(@RequestParam Map<String, String> values) {
        logger.debug("Report received from weather station");
        startQueueThread();
        String ret = processReportString(values);
        logger.debug("Report processed");
        return ret;
    }

    private synchronized void startQueueThread() {
        if (threadStarted) {
            return;
        }
        cwopReportQueueReader.readerThread();
        threadStarted = true;
    }

    private String processReportString(Map<String, String> values) {
        if (values == null) {
            return "OK";
        }
        try {
            AmbientWeatherStationProperties report = new AmbientWeatherStationProperties();
            if (values.containsKey("dailyrainin")) {
                report.setDailyrainin(Optional.of(Double.parseDouble(values.get("dailyrainin"))));
            } else {
                report.setDailyrainin(Optional.of(0.0));
            }
            if (values.containsKey("humidity")) {
                report.setHumidity(Optional.of(Integer.parseInt(values.get("humidity"))));
            } else {
                report.setHumidity(Optional.of(0));
            }
            if (values.containsKey("x24hourrainin")) {
                report.setX24hourrainin(Optional.of(Double.parseDouble(values.get("x24hourrainin"))));
            } else {
                report.setX24hourrainin(Optional.of(0.0));
            }
            if (values.containsKey("baromrelin")) {
                report.setBaromrelin(Optional.of(Double.parseDouble(values.get("baromrelin"))));
            } else {
                report.setBaromrelin(Optional.of(0.0));
            }
            if (values.containsKey("hourlyrainin")) {
                report.setHourlyrainin(Optional.of(Double.parseDouble(values.get("hourlyrainin"))));
            } else {
                report.setHourlyrainin(Optional.of(0.0));
            }
            if (values.containsKey("solarradiation")) {
                report.setSolarradiation(Optional.of(Double.parseDouble(values.get("solarradiation"))));
            } else {
                report.setSolarradiation(Optional.of(0.0));
            }
            if (values.containsKey("tempf")) {
                report.setTempf(Optional.of(Double.parseDouble(values.get("tempf"))));
            } else {
                report.setTempf(Optional.of(0.0));
            }
            if (values.containsKey("winddir")) {
                report.setWinddir(Optional.of(Integer.parseInt(values.get("winddir"))));
            } else {
                report.setWinddir(Optional.of(0));
            }
            if (values.containsKey("windgustmph")) {
                report.setWindgustmph(Optional.of(Double.parseDouble(values.get("windgustmph"))));
            } else {
                report.setWindgustmph(Optional.of(0.0));
            }
            if (values.containsKey("windspeedmph")) {
                report.setWindspeedmph(Optional.of(Double.parseDouble(values.get("windspeedmph"))));
            } else {
                report.setWindspeedmph(Optional.of(0.0));
            }
            if (values.containsKey("dateutc")) {
                report.setDateutc(Optional.of(values.get("dateutc")));
            }
            ambientWeatherStationReportProcessor.processReport(report);
        } catch (Exception e) {
            logger.error("Exception caught processing weather report", e);
        }
        return "OK";  // weather device does not care
    }
}
