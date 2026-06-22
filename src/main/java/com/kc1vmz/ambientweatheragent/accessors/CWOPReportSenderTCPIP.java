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

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kc1vmz.ambientweatheragent.ApplicationConfiguration;
import com.kc1vmz.ambientweatheragent.objects.CWOPReport;

import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.ObjectWriter;

import java.net.URI;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Service
public class CWOPReportSenderTCPIP {
    @Autowired 
    private ApplicationConfiguration applicationConfiguration;
    private static final Logger logger = LogManager.getLogger(CWOPReportSenderTCPIP.class);

    /**
     * Send a CWOP weather report to cwop.rest service
     *
     * @param report CWOP weather report
     */
    public void sendToCWOP(CWOPReport report) {
        report.setId(applicationConfiguration.getCallsign());
        report.setLon(Double.parseDouble(applicationConfiguration.getLongitude()));
        report.setLat(Double.parseDouble(applicationConfiguration.getLatitude()));

        // send it to https://send.cwop.rest
        String uri = "https://send.cwop.rest";
        try {
            Duration duration = Duration.ofMinutes(2);
            ObjectMapper objectMapper = new ObjectMapper();
            ObjectWriter ow = objectMapper.writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(report);
            logger.debug(String.format("CWOP REST Request: %s", json));

            HttpClient client = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri))
                    .POST(BodyPublishers.ofString(json))
                    .timeout(duration)
                    .build();

            HttpResponse<?> response = client.send(request,  BodyHandlers.ofString());
            String responseBody = response.body().toString();
            logger.debug(String.format("CWOP REST Response: %s", responseBody));
        } catch (Exception e) {
            logger.error("Exception caught sending request to CWOP", e);
        }
        
    }
}


