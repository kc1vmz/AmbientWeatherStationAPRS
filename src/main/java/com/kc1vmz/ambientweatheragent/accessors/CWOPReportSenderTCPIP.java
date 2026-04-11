package com.kc1vmz.ambientweatheragent.accessors;

import java.net.URI;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.LocalDateTime;
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
            ObjectMapper objectMapper = getObjectMapper();
            ObjectWriter ow = objectMapper.writer().withDefaultPrettyPrinter();
            String json = ow.writeValueAsString(report);

            HttpClient client = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri))
                    .POST(BodyPublishers.ofString(json))
                    .build();

            HttpResponse<?> response = client.send(request,  BodyHandlers.ofString());
            String responseBody = response.body().toString();
            System.out.println(String.format("%s : %s", LocalDateTime.now().toString(), responseBody));
        } catch (Exception e) {
            e.printStackTrace();
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


