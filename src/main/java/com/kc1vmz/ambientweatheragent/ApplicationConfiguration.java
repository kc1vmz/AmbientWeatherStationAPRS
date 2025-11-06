package com.kc1vmz.ambientweatheragent;

import io.micronaut.context.annotation.Value;
import jakarta.inject.Singleton;

@Singleton
public class ApplicationConfiguration {
    @Value("${app.callsign}")
    private String callsign;
    @Value("${app.latitude}")
    private String latitude;
    @Value("${app.longitude}")
    private String longitude;

    public String getCallsign() {
        return callsign;
    }
    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }
    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}