package com.kc1vmz.ambientweatheragent.accessors;

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

import java.time.ZonedDateTime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kc1vmz.ambientweatheragent.objects.AmbientWeatherStationProperties;
import com.kc1vmz.ambientweatheragent.objects.CWOPReport;
import com.kc1vmz.ambientweatheragent.queue.CWOPReportQueue;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class AmbientWeatherStationReportProcessor {
    @Inject
    private CWOPReportQueue cwopReportQueue;
    private static final Logger logger = LogManager.getLogger(AmbientWeatherStationReportProcessor.class);

    /**
     * Process a report by sending it to CWOP via cwop.rest
     * @param report Weather report to send to CWOP
     */
    public void processReport(AmbientWeatherStationProperties report) {
        try {
            cwopReportQueue.addCWOPReport(createCWOPReport(report));
        } catch (Exception e) {
           logger.error("Exception caught processing report", e);
        }
    }

    /**
     * create a CWOP report from an Ambient Weather Station report
     *
     * @param report  Ambient Weather Station report
     * @return CWOP report
     */
    public CWOPReport createCWOPReport(AmbientWeatherStationProperties report) {
        CWOPReport cwopReport = new CWOPReport();
        if (report.getDailyrainin().isPresent()) {
            cwopReport.setDailyrainin(report.getDailyrainin().get());
        }
        if (report.getHumidity().isPresent()) {
            cwopReport.setHumidity(report.getHumidity().get());
        }
        if (report.getX24hourrainin().isPresent()) {
            cwopReport.setLast24hrrainin(report.getX24hourrainin().get());
        }
        if (report.getBaromrelin().isPresent()) {
            cwopReport.setPressure(convertPressure(report.getBaromrelin().get()));
        }
        if (report.getHourlyrainin().isPresent()) {
            cwopReport.setRainin(report.getHourlyrainin().get());
        }
        if (report.getSolarradiation().isPresent()) {
            cwopReport.setSolarradiation(report.getSolarradiation().get().intValue());
        }
        if (report.getTempf().isPresent()) {
            cwopReport.setTempf(report.getTempf().get().intValue());
        }
        if (report.getWinddir().isPresent()) {
            cwopReport.setWinddir(report.getWinddir().get());
        }
        if (report.getWindgustmph().isPresent()) {
            cwopReport.setWindgustmph(report.getWindgustmph().get());
        }
        if (report.getWindspeedmph().isPresent()) {
            cwopReport.setWindspeedmph(report.getWindspeedmph().get());
        }
        cwopReport.setTime(getTime(report.getDateutc().get()));

        return cwopReport;
    }

    /**
     * Convert reported Barometric Pressure from inHg to mb
     *
     * @param value barometric pressure in inHg
     * @return barometric pressure in mb
     */
    private double convertPressure(Double value) {
        // convert 1in mercury to millibars
        return 33.8639*value;
    }

    /**
     * Convert Ambient Weather Station time to ISO-8601 time
     *
     * @param zulu Ambient time in proprietary format
     * @return ISO-8601 time string
     */
    private ZonedDateTime getTime(String zulu) {
        String iso = zulu.substring(0, 10)+"T"+zulu.substring(11)+"Z";
        return ZonedDateTime.parse(iso);
    }
}


