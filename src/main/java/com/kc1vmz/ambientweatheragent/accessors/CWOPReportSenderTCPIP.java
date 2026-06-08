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
import java.net.URI;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.kc1vmz.ambientweatheragent.ApplicationConfiguration;
import com.kc1vmz.ambientweatheragent.objects.CWOPReport;

@Singleton
public class CWOPReportSenderTCPIP {
    @Inject
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
            ObjectMapper objectMapper = getObjectMapper();
            ObjectWriter ow = objectMapper.writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(report);
            logger.info(String.format("CWOP REST Request: %s", json));

            HttpClient client = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri))
                    .POST(BodyPublishers.ofString(json))
                    .timeout(duration)
                    .build();

            HttpResponse<?> response = client.send(request,  BodyHandlers.ofString());
            String responseBody = response.body().toString();
            logger.info(String.format("CWOP REST Response: %s", responseBody));
        } catch (Exception e) {
            logger.error("Exception caught sending request to CWOP", e);
        }
        
    }

    /**
     * initialize the object mapper with common extensions
     *
     * @return
     */
    private ObjectMapper getObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.registerModule(new Jdk8Module());

        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        return objectMapper;
    }
}


