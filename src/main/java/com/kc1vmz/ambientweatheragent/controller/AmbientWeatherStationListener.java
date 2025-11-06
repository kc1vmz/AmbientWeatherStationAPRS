package com.kc1vmz.ambientweatheragent.controller;

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

    // https://ambientweather.com/faqs/question/view/id/1857/
    @Get(uri="/{?report*}")
    public String receivedReport(@Valid AmbientWeatherStationProperties report) { 
        ambientWeatherStationReportProcessor.processReport(report);
        return "OK";  // weather device does not care
    }
}
