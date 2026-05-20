package com.kc1vmz.ambientweatheragent.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kc1vmz.ambientweatheragent.accessors.AmbientWeatherStationReportProcessor;
import com.kc1vmz.ambientweatheragent.objects.AmbientWeatherStationProperties;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import jakarta.validation.Valid;

/*
 * Ambient Weather Station customization is configured to send AmbientWeather format data to this endpoint.
 * Configure weather station to send data every 10 minutes to yourIP:yourPort/report?fix=1
 * Ambient Weather stations will send data starting with an &, the path needs a starting query param to make it work properly.
 * If you change the "fix=1" then the variable "fix" needs to be altered in the AmbientWeatherStationProperties object definition.
 */

@Controller("/report") 
public class AmbientWeatherStationListener {

    @Inject
    private AmbientWeatherStationReportProcessor ambientWeatherStationReportProcessor;
    private static final Logger logger = LogManager.getLogger(AmbientWeatherStationListener.class);

    // https://ambientweather.com/faqs/question/view/id/1857/
    @Get(uri="/{?report*}")
    public String receivedReport(@Valid String report) { 

        logger.info("Report received from weather station");
        String ret = processReportString(report);
        logger.info("Report processed");
        return ret;
    }

    private String processReportString(String val) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            AmbientWeatherStationProperties report = mapper.readValue(val, AmbientWeatherStationProperties.class);
            ambientWeatherStationReportProcessor.processReport(report);
        } catch (Exception e) {
            logger.error(String.format("Exception caught processing weather report: '%s'", val), e);
        }
        return "OK";  // weather device does not care
    }
}
