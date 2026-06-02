package com.kc1vmz.ambientweatheragent.objects;

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

import com.fasterxml.jackson.annotation.JsonProperty;

public class CWOPReport {
    @JsonProperty("id") // Required. Your CWOP or Ham Radio ID.
    private String id;
    @JsonProperty("lat") // Required. Your weather station's latitude in decimal degrees.
    private double lat;
    @JsonProperty("long") // Required. Your weather station's longitude in decimal degrees.
    private double lon;
    @JsonProperty("time") // Required. The time that your weather reading was taken in ISO Date or Epoch (milliseconds) format.
    private ZonedDateTime time;
    @JsonProperty("tempf") // Required. The temperature in degrees fahrenheit.
    private int tempf;
    @JsonProperty("windspeedmph") // Required. The wind speed in miles per hour.
    private double windspeedmph;
    @JsonProperty("windgustmph") // Required. The wind gust in miles per hour.
    private double windgustmph;
    @JsonProperty("winddir") // Required. The direction that the wind is coming from, 0–359 degrees.
    private int winddir;
    @JsonProperty("pressure") // Optional. The barometer pressure in Hectopascals/Millibars.
    private double pressure;
    @JsonProperty("humidity") // Optional. The relative humidity from 0 to 100 percent.
    private int humidity;
    @JsonProperty("solarradiation") // Optional. The solar radiation in W/m².
    private int solarradiation;
    @JsonProperty("rainin") // Optional. The amount of rain that has fallen over the past hour in inches.
    private double rainin;
    @JsonProperty("dailyrainin") // Optional. The amount of rain that has fallen since midnight in inches.
    private double dailyrainin;
    @JsonProperty("last24hrrainin") // Optional. The amount of rain that has fallen over the past 24 hours in inches.
    private double last24hrrainin;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }
    public double getLon() {
        return lon;
    }
    public void setLon(double lon) {
        this.lon = lon;
    }
    public ZonedDateTime getTime() {
        return time;
    }
    public void setTime(ZonedDateTime time) {
        this.time = time;
    }
    public int getTempf() {
        return tempf;
    }
    public void setTempf(int tempf) {
        this.tempf = tempf;
    }
    public double getWindspeedmph() {
        return windspeedmph;
    }
    public void setWindspeedmph(double windspeedmph) {
        this.windspeedmph = windspeedmph;
    }
    public double getWindgustmph() {
        return windgustmph;
    }
    public void setWindgustmph(double windgustmph) {
        this.windgustmph = windgustmph;
    }
    public int getWinddir() {
        return winddir;
    }
    public void setWinddir(int winddir) {
        this.winddir = winddir;
    }
    public double getPressure() {
        return pressure;
    }
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
    public int getHumidity() {
        return humidity;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public int getSolarradiation() {
        return solarradiation;
    }
    public void setSolarradiation(int solarradiation) {
        this.solarradiation = solarradiation;
    }
    public double getRainin() {
        return rainin;
    }
    public void setRainin(double rainin) {
        this.rainin = rainin;
    }
    public double getDailyrainin() {
        return dailyrainin;
    }
    public void setDailyrainin(double dailyrainin) {
        this.dailyrainin = dailyrainin;
    }
    public double getLast24hrrainin() {
        return last24hrrainin;
    }
    public void setLast24hrrainin(double last24hrrainin) {
        this.last24hrrainin = last24hrrainin;
    }
}
