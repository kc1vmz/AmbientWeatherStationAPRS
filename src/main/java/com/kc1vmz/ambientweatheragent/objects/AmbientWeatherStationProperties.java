package com.kc1vmz.ambientweatheragent.objects;

import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable.Deserializable;

/*
 * Only values needed by CWOP are properly cast to their correct data types.
 * The rest are read as strings.
 */
@Introspected
@Deserializable
public class AmbientWeatherStationProperties {
    @JsonProperty("fix")
    private Optional<String> fix;
    
    @JsonProperty("PASSKEY")
    private Optional<String> PASSKEY;
    @JsonProperty("stationtype")
    private Optional<String> stationtype;
    @JsonProperty("dateutc")
    private Optional<String> dateutc;
    @JsonProperty("tempf")
    private Optional<Double> tempf;
    @JsonProperty("humidity")
    private Optional<Integer> humidity;
    @JsonProperty("windspeedmph")
    private Optional<Double> windspeedmph;
    @JsonProperty("windgustmph")
    private Optional<Double> windgustmph;
    @JsonProperty("maxdailygust")
    private Optional<String> maxdailygust;
    @JsonProperty("winddir")
    private Optional<Integer> winddir;
    @JsonProperty("uv")
    private Optional<String> uv;
    @JsonProperty("solarradiation")
    private Optional<Double> solarradiation;
    @JsonProperty("hourlyrainin")
    private Optional<Double> hourlyrainin;
    @JsonProperty("eventrainin")
    private Optional<Double> eventrainin;
    @JsonProperty("dailyrainin")
    private Optional<Double> dailyrainin;
    @JsonProperty("weeklyrainin")
    private Optional<Double> weeklyrainin;
    @JsonProperty("monthlyrainin")
    private Optional<Double> monthlyrainin;
    @JsonProperty("yearlyrainin")
    private Optional<Double> yearlyrainin;
    @JsonProperty("totalrainin")
    private Optional<Double> totalrainin;
    @JsonProperty("battout")
    private Optional<String> battout;
    @JsonProperty("tempinf")
    private Optional<String> tempinf;
    @JsonProperty("humidityin")
    private Optional<String> humidityin;
    @JsonProperty("baromrelin")
    private Optional<Double> baromrelin;
    @JsonProperty("baromabsin")
    private Optional<Double> baromabsin;
    @JsonProperty("windgustdir")
    private Optional<String> windgustdir;
    @JsonProperty("windspdmph_avg2m")
    private Optional<String> windspdmph_avg2m;
    @JsonProperty("winddir_avg2m")
    private Optional<String> winddir_avg2m;
    @JsonProperty("windspdmph_avg10m")
    private Optional<String> windspdmph_avg10m;
    @JsonProperty("winddir_avg10m")
    private Optional<String> winddir_avg10m;
    @JsonProperty("windgustmph_interval")
    private Optional<String> windgustmph_interval;
    @JsonProperty("humidity1")
    private Optional<String> humidity1;
    @JsonProperty("humidity2")
    private Optional<String> humidity2;
    @JsonProperty("humidity3")
    private Optional<String> humidity3;
    @JsonProperty("humidity4")
    private Optional<String> humidity4;
    @JsonProperty("humidity5")
    private Optional<String> humidity5;
    @JsonProperty("humidity6")
    private Optional<String> humidity6;
    @JsonProperty("humidity7")
    private Optional<String> humidity7;
    @JsonProperty("humidity8")
    private Optional<String> humidity8;
    @JsonProperty("humidity9")
    private Optional<String> humidity9;
    @JsonProperty("humidity10")
    private Optional<String> humidity10;
    @JsonProperty("temp1f")
    private Optional<String> temp1f;
    @JsonProperty("temp2f")
    private Optional<String> temp2f;
    @JsonProperty("temp3f")
    private Optional<String> temp3f;
    @JsonProperty("temp4f")
    private Optional<String> temp4f;
    @JsonProperty("temp5f")
    private Optional<String> temp5f;
    @JsonProperty("temp6f")
    private Optional<String> temp6f;
    @JsonProperty("temp7f")
    private Optional<String> temp7f;
    @JsonProperty("temp8f")
    private Optional<String> temp8f;
    @JsonProperty("temp9f")
    private Optional<String> temp9f;
    @JsonProperty("temp10f")
    private Optional<String> temp10f;
    @JsonProperty("24hourrainin")
    private Optional<Double> x24hourrainin;
    @JsonProperty("co2")
    private Optional<String> co2;
    @JsonProperty("pm25")
    private Optional<String> pm25;
    @JsonProperty("pm25_24h")
    private Optional<String> pm25_24h;
    @JsonProperty("pm25_in")
    private Optional<String> pm25_in;
    @JsonProperty("pm25_in_24h")
    private Optional<String> pm25_in_24h;
    @JsonProperty("pm10_in")
    private Optional<String> pm10_in;
    @JsonProperty("pm10_in_24h")
    private Optional<String> pm10_in_24h;
    @JsonProperty("co2_in")
    private Optional<String> co2_in;
    @JsonProperty("co2_in_24h")
    private Optional<String> co2_in_24h;
    @JsonProperty("pm_in_temp")
    private Optional<String> pm_in_temp;
    @JsonProperty("pm_in_humidity")
    private Optional<String> pm_in_humidity;
    @JsonProperty("relay1")
    private Optional<String> relay1;
    @JsonProperty("relay2")
    private Optional<String> pmrelay210_in;
    @JsonProperty("relay3")
    private Optional<String> relay3;
    @JsonProperty("relay4")
    private Optional<String> relay4;
    @JsonProperty("relay5")
    private Optional<String> relay5;
    @JsonProperty("relay6")
    private Optional<String> relay6;
    @JsonProperty("relay7")
    private Optional<String> relay7;
    @JsonProperty("relay8")
    private Optional<String> relay8;
    @JsonProperty("relay9")
    private Optional<String> relay9;
    @JsonProperty("relay10")
    private Optional<String> relay10;
    @JsonProperty("soiltemp1")
    private Optional<String> soiltemp1;
    @JsonProperty("soiltemp2")
    private Optional<String> soiltemp2;
    @JsonProperty("soiltemp3")
    private Optional<String> soiltemp3;
    @JsonProperty("soiltemp4")
    private Optional<String> soiltemp4;
    @JsonProperty("soiltemp5")
    private Optional<String> soiltemp5;
    @JsonProperty("soiltemp6")
    private Optional<String> soiltemp6;
    @JsonProperty("soiltemp7")
    private Optional<String> soiltemp7;
    @JsonProperty("soiltemp8")
    private Optional<String> soiltemp8;
    @JsonProperty("soiltemp9")
    private Optional<String> soiltemp9;
    @JsonProperty("soiltemp10")
    private Optional<String> soiltemp10;
    @JsonProperty("soilhum1")
    private Optional<String> soilhum1;
    @JsonProperty("soilhum2")
    private Optional<String> soilhum2;
    @JsonProperty("soilhum3")
    private Optional<String> soilhum3;
    @JsonProperty("soilhum4")
    private Optional<String> soilhum4;
    @JsonProperty("soilhum5")
    private Optional<String> soilhum5;
    @JsonProperty("soilhum6")
    private Optional<String> soilhum6;
    @JsonProperty("soilhum7")
    private Optional<String> soilhum7;
    @JsonProperty("soilhum8")
    private Optional<String> soilhum8;
    @JsonProperty("soilhum9")
    private Optional<String> soilhum9;
    @JsonProperty("soilhum10")
    private Optional<String> soilhum10;
    @JsonProperty("leak1")
    private Optional<String> leak1;
    @JsonProperty("leak2")
    private Optional<String> leak2;
    @JsonProperty("leak3")
    private Optional<String> leak3;
    @JsonProperty("leak4")
    private Optional<String> leak4;
    @JsonProperty("lightning_time")
    private Optional<String> lightning_time;
    @JsonProperty("lightning_day")
    private Optional<String> lightning_day;
    @JsonProperty("lightning_distance")
    private Optional<String> lightning_distance;
    @JsonProperty("battin")
    private Optional<String> battin;
    @JsonProperty("batt1")
    private Optional<String> batt1;
    @JsonProperty("batt2")
    private Optional<String> batt2;
    @JsonProperty("batt3")
    private Optional<String> batt3;
    @JsonProperty("batt4")
    private Optional<String> batt4;
    @JsonProperty("batt5")
    private Optional<String> batt5;
    @JsonProperty("batt6")
    private Optional<String> batt6;
    @JsonProperty("batt7")
    private Optional<String> batt7;
    @JsonProperty("batt8")
    private Optional<String> batt8;
    @JsonProperty("batt9")
    private Optional<String> batt9;
    @JsonProperty("batt10")
    private Optional<String> batt10;
    @JsonProperty("battr1")
    private Optional<String> battr1;
    @JsonProperty("battr2")
    private Optional<String> battr2;
    @JsonProperty("battr3")
    private Optional<String> battr3;
    @JsonProperty("battr4")
    private Optional<String> battr4;
    @JsonProperty("battr5")
    private Optional<String> battr5;
    @JsonProperty("battr6")
    private Optional<String> battr6;
    @JsonProperty("battr7")
    private Optional<String> battr7;
    @JsonProperty("battr8")
    private Optional<String> battr8;
    @JsonProperty("battr9")
    private Optional<String> battr9;
    @JsonProperty("battr10")
    private Optional<String> battr10;
    @JsonProperty("batt_25")
    private Optional<String> batt_25;
    @JsonProperty("batt_25in")
    private Optional<String> batt_25in;
    @JsonProperty("batleak1")
    private Optional<String> batleak1;
    @JsonProperty("batleak2")
    private Optional<String> batleak2;
    @JsonProperty("batleak3")
    private Optional<String> batleak3;
    @JsonProperty("batleak4")
    private Optional<String> batleak4;
    @JsonProperty("batt_lightning")
    private Optional<String> batt_lightning;
    @JsonProperty("battsm1")
    private Optional<String> battsm1;
    @JsonProperty("battsm2")
    private Optional<String> battsm2;
    @JsonProperty("battsm3")
    private Optional<String> battsm3;
    @JsonProperty("battsm4")
    private Optional<String> battsm4;
    @JsonProperty("battrain")
    private Optional<String> battrain;

    public Optional<String> getPASSKEY() {
        return PASSKEY;
    }
    public void setPASSKEY(Optional<String> pASSKEY) {
        PASSKEY = pASSKEY;
    }
    public Optional<String> getStationtype() {
        return stationtype;
    }
    public void setStationtype(Optional<String> stationtype) {
        this.stationtype = stationtype;
    }
    public Optional<String> getDateutc() {
        return dateutc;
    }
    public void setDateutc(Optional<String> dateutc) {
        this.dateutc = dateutc;
    }
    public Optional<Double> getTempf() {
        return tempf;
    }
    public void setTempf(Optional<Double> tempf) {
        this.tempf = tempf;
    }
    public Optional<Integer> getHumidity() {
        return humidity;
    }
    public void setHumidity(Optional<Integer> humidity) {
        this.humidity = humidity;
    }
    public Optional<Double> getWindspeedmph() {
        return windspeedmph;
    }
    public void setWindspeedmph(Optional<Double> windspeedmph) {
        this.windspeedmph = windspeedmph;
    }
    public Optional<Double> getWindgustmph() {
        return windgustmph;
    }
    public void setWindgustmph(Optional<Double> windgustmph) {
        this.windgustmph = windgustmph;
    }
    public Optional<String> getMaxdailygust() {
        return maxdailygust;
    }
    public void setMaxdailygust(Optional<String> maxdailygust) {
        this.maxdailygust = maxdailygust;
    }
    public Optional<Integer> getWinddir() {
        return winddir;
    }
    public void setWinddir(Optional<Integer> winddir) {
        this.winddir = winddir;
    }
    public Optional<String> getUv() {
        return uv;
    }
    public void setUv(Optional<String> uv) {
        this.uv = uv;
    }
    public Optional<Double> getSolarradiation() {
        return solarradiation;
    }
    public void setSolarradiation(Optional<Double> solarradiation) {
        this.solarradiation = solarradiation;
    }
    public Optional<Double> getHourlyrainin() {
        return hourlyrainin;
    }
    public void setHourlyrainin(Optional<Double> hourlyrainin) {
        this.hourlyrainin = hourlyrainin;
    }
    public Optional<Double> getEventrainin() {
        return eventrainin;
    }
    public void setEventrainin(Optional<Double> eventrainin) {
        this.eventrainin = eventrainin;
    }
    public Optional<Double> getDailyrainin() {
        return dailyrainin;
    }
    public void setDailyrainin(Optional<Double> dailyrainin) {
        this.dailyrainin = dailyrainin;
    }
    public Optional<Double> getWeeklyrainin() {
        return weeklyrainin;
    }
    public void setWeeklyrainin(Optional<Double> weeklyrainin) {
        this.weeklyrainin = weeklyrainin;
    }
    public Optional<Double> getMonthlyrainin() {
        return monthlyrainin;
    }
    public void setMonthlyrainin(Optional<Double> monthlyrainin) {
        this.monthlyrainin = monthlyrainin;
    }
    public Optional<Double> getYearlyrainin() {
        return yearlyrainin;
    }
    public void setYearlyrainin(Optional<Double> yearlyrainin) {
        this.yearlyrainin = yearlyrainin;
    }
    public Optional<Double> getTotalrainin() {
        return totalrainin;
    }
    public void setTotalrainin(Optional<Double> totalrainin) {
        this.totalrainin = totalrainin;
    }
    public Optional<String> getBattout() {
        return battout;
    }
    public void setBattout(Optional<String> battout) {
        this.battout = battout;
    }
    public Optional<String> getTempinf() {
        return tempinf;
    }
    public void setTempinf(Optional<String> tempinf) {
        this.tempinf = tempinf;
    }
    public Optional<String> getHumidityin() {
        return humidityin;
    }
    public void setHumidityin(Optional<String> humidityin) {
        this.humidityin = humidityin;
    }
    public Optional<Double> getBaromrelin() {
        return baromrelin;
    }
    public void setBaromrelin(Optional<Double> baromrelin) {
        this.baromrelin = baromrelin;
    }
    public Optional<Double> getBaromabsin() {
        return baromabsin;
    }
    public void setBaromabsin(Optional<Double> baromabsin) {
        this.baromabsin = baromabsin;
    }
    public Optional<String> getFix() {
        return fix;
    }
    public void setFix(Optional<String> fix) {
        this.fix = fix;
    }
    public Optional<String> getWindgustdir() {
        return windgustdir;
    }
    public void setWindgustdir(Optional<String> windgustdir) {
        this.windgustdir = windgustdir;
    }
    public Optional<String> getWindspdmph_avg2m() {
        return windspdmph_avg2m;
    }
    public void setWindspdmph_avg2m(Optional<String> windspdmph_avg2m) {
        this.windspdmph_avg2m = windspdmph_avg2m;
    }
    public Optional<String> getWinddir_avg2m() {
        return winddir_avg2m;
    }
    public void setWinddir_avg2m(Optional<String> winddir_avg2m) {
        this.winddir_avg2m = winddir_avg2m;
    }
    public Optional<String> getWindspdmph_avg10m() {
        return windspdmph_avg10m;
    }
    public void setWindspdmph_avg10m(Optional<String> windspdmph_avg10m) {
        this.windspdmph_avg10m = windspdmph_avg10m;
    }
    public Optional<String> getWinddir_avg10m() {
        return winddir_avg10m;
    }
    public void setWinddir_avg10m(Optional<String> winddir_avg10m) {
        this.winddir_avg10m = winddir_avg10m;
    }
    public Optional<String> getWindgustmph_interval() {
        return windgustmph_interval;
    }
    public void setWindgustmph_interval(Optional<String> windgustmph_interval) {
        this.windgustmph_interval = windgustmph_interval;
    }
    public Optional<String> getHumidity1() {
        return humidity1;
    }
    public void setHumidity1(Optional<String> humidity1) {
        this.humidity1 = humidity1;
    }
    public Optional<String> getHumidity2() {
        return humidity2;
    }
    public void setHumidity2(Optional<String> humidity2) {
        this.humidity2 = humidity2;
    }
    public Optional<String> getHumidity3() {
        return humidity3;
    }
    public void setHumidity3(Optional<String> humidity3) {
        this.humidity3 = humidity3;
    }
    public Optional<String> getHumidity4() {
        return humidity4;
    }
    public void setHumidity4(Optional<String> humidity4) {
        this.humidity4 = humidity4;
    }
    public Optional<String> getHumidity5() {
        return humidity5;
    }
    public void setHumidity5(Optional<String> humidity5) {
        this.humidity5 = humidity5;
    }
    public Optional<String> getHumidity6() {
        return humidity6;
    }
    public void setHumidity6(Optional<String> humidity6) {
        this.humidity6 = humidity6;
    }
    public Optional<String> getHumidity7() {
        return humidity7;
    }
    public void setHumidity7(Optional<String> humidity7) {
        this.humidity7 = humidity7;
    }
    public Optional<String> getHumidity8() {
        return humidity8;
    }
    public void setHumidity8(Optional<String> humidity8) {
        this.humidity8 = humidity8;
    }
    public Optional<String> getHumidity9() {
        return humidity9;
    }
    public void setHumidity9(Optional<String> humidity9) {
        this.humidity9 = humidity9;
    }
    public Optional<String> getHumidity10() {
        return humidity10;
    }
    public void setHumidity10(Optional<String> humidity10) {
        this.humidity10 = humidity10;
    }
    public Optional<String> getTemp1f() {
        return temp1f;
    }
    public void setTemp1f(Optional<String> temp1f) {
        this.temp1f = temp1f;
    }
    public Optional<String> getTemp2f() {
        return temp2f;
    }
    public void setTemp2f(Optional<String> temp2f) {
        this.temp2f = temp2f;
    }
    public Optional<String> getTemp3f() {
        return temp3f;
    }
    public void setTemp3f(Optional<String> temp3f) {
        this.temp3f = temp3f;
    }
    public Optional<String> getTemp4f() {
        return temp4f;
    }
    public void setTemp4f(Optional<String> temp4f) {
        this.temp4f = temp4f;
    }
    public Optional<String> getTemp5f() {
        return temp5f;
    }
    public void setTemp5f(Optional<String> temp5f) {
        this.temp5f = temp5f;
    }
    public Optional<String> getTemp6f() {
        return temp6f;
    }
    public void setTemp6f(Optional<String> temp6f) {
        this.temp6f = temp6f;
    }
    public Optional<String> getTemp7f() {
        return temp7f;
    }
    public void setTemp7f(Optional<String> temp7f) {
        this.temp7f = temp7f;
    }
    public Optional<String> getTemp8f() {
        return temp8f;
    }
    public void setTemp8f(Optional<String> temp8f) {
        this.temp8f = temp8f;
    }
    public Optional<String> getTemp9f() {
        return temp9f;
    }
    public void setTemp9f(Optional<String> temp9f) {
        this.temp9f = temp9f;
    }
    public Optional<String> getTemp10f() {
        return temp10f;
    }
    public void setTemp10f(Optional<String> temp10f) {
        this.temp10f = temp10f;
    }
    public Optional<Double> getX24hourrainin() {
        return x24hourrainin;
    }
    public void setX24hourrainin(Optional<Double> x24hourrainin) {
        this.x24hourrainin = x24hourrainin;
    }
    public Optional<String> getCo2() {
        return co2;
    }
    public void setCo2(Optional<String> co2) {
        this.co2 = co2;
    }
    public Optional<String> getPm25() {
        return pm25;
    }
    public void setPm25(Optional<String> pm25) {
        this.pm25 = pm25;
    }
    public Optional<String> getPm25_24h() {
        return pm25_24h;
    }
    public void setPm25_24h(Optional<String> pm25_24h) {
        this.pm25_24h = pm25_24h;
    }
    public Optional<String> getPm25_in() {
        return pm25_in;
    }
    public void setPm25_in(Optional<String> pm25_in) {
        this.pm25_in = pm25_in;
    }
    public Optional<String> getPm25_in_24h() {
        return pm25_in_24h;
    }
    public void setPm25_in_24h(Optional<String> pm25_in_24h) {
        this.pm25_in_24h = pm25_in_24h;
    }
    public Optional<String> getPm10_in() {
        return pm10_in;
    }
    public void setPm10_in(Optional<String> pm10_in) {
        this.pm10_in = pm10_in;
    }
    public Optional<String> getPm10_in_24h() {
        return pm10_in_24h;
    }
    public void setPm10_in_24h(Optional<String> pm10_in_24h) {
        this.pm10_in_24h = pm10_in_24h;
    }
    public Optional<String> getCo2_in() {
        return co2_in;
    }
    public void setCo2_in(Optional<String> co2_in) {
        this.co2_in = co2_in;
    }
    public Optional<String> getCo2_in_24h() {
        return co2_in_24h;
    }
    public void setCo2_in_24h(Optional<String> co2_in_24h) {
        this.co2_in_24h = co2_in_24h;
    }
    public Optional<String> getPm_in_temp() {
        return pm_in_temp;
    }
    public void setPm_in_temp(Optional<String> pm_in_temp) {
        this.pm_in_temp = pm_in_temp;
    }
    public Optional<String> getPm_in_humidity() {
        return pm_in_humidity;
    }
    public void setPm_in_humidity(Optional<String> pm_in_humidity) {
        this.pm_in_humidity = pm_in_humidity;
    }
    public Optional<String> getRelay1() {
        return relay1;
    }
    public void setRelay1(Optional<String> relay1) {
        this.relay1 = relay1;
    }
    public Optional<String> getPmrelay210_in() {
        return pmrelay210_in;
    }
    public void setPmrelay210_in(Optional<String> pmrelay210_in) {
        this.pmrelay210_in = pmrelay210_in;
    }
    public Optional<String> getRelay3() {
        return relay3;
    }
    public void setRelay3(Optional<String> relay3) {
        this.relay3 = relay3;
    }
    public Optional<String> getRelay4() {
        return relay4;
    }
    public void setRelay4(Optional<String> relay4) {
        this.relay4 = relay4;
    }
    public Optional<String> getRelay5() {
        return relay5;
    }
    public void setRelay5(Optional<String> relay5) {
        this.relay5 = relay5;
    }
    public Optional<String> getRelay6() {
        return relay6;
    }
    public void setRelay6(Optional<String> relay6) {
        this.relay6 = relay6;
    }
    public Optional<String> getRelay7() {
        return relay7;
    }
    public void setRelay7(Optional<String> relay7) {
        this.relay7 = relay7;
    }
    public Optional<String> getRelay8() {
        return relay8;
    }
    public void setRelay8(Optional<String> relay8) {
        this.relay8 = relay8;
    }
    public Optional<String> getRelay9() {
        return relay9;
    }
    public void setRelay9(Optional<String> relay9) {
        this.relay9 = relay9;
    }
    public Optional<String> getRelay10() {
        return relay10;
    }
    public void setRelay10(Optional<String> relay10) {
        this.relay10 = relay10;
    }
    public Optional<String> getSoiltemp1() {
        return soiltemp1;
    }
    public void setSoiltemp1(Optional<String> soiltemp1) {
        this.soiltemp1 = soiltemp1;
    }
    public Optional<String> getSoiltemp2() {
        return soiltemp2;
    }
    public void setSoiltemp2(Optional<String> soiltemp2) {
        this.soiltemp2 = soiltemp2;
    }
    public Optional<String> getSoiltemp3() {
        return soiltemp3;
    }
    public void setSoiltemp3(Optional<String> soiltemp3) {
        this.soiltemp3 = soiltemp3;
    }
    public Optional<String> getSoiltemp4() {
        return soiltemp4;
    }
    public void setSoiltemp4(Optional<String> soiltemp4) {
        this.soiltemp4 = soiltemp4;
    }
    public Optional<String> getSoiltemp5() {
        return soiltemp5;
    }
    public void setSoiltemp5(Optional<String> soiltemp5) {
        this.soiltemp5 = soiltemp5;
    }
    public Optional<String> getSoiltemp6() {
        return soiltemp6;
    }
    public void setSoiltemp6(Optional<String> soiltemp6) {
        this.soiltemp6 = soiltemp6;
    }
    public Optional<String> getSoiltemp7() {
        return soiltemp7;
    }
    public void setSoiltemp7(Optional<String> soiltemp7) {
        this.soiltemp7 = soiltemp7;
    }
    public Optional<String> getSoiltemp8() {
        return soiltemp8;
    }
    public void setSoiltemp8(Optional<String> soiltemp8) {
        this.soiltemp8 = soiltemp8;
    }
    public Optional<String> getSoiltemp9() {
        return soiltemp9;
    }
    public void setSoiltemp9(Optional<String> soiltemp9) {
        this.soiltemp9 = soiltemp9;
    }
    public Optional<String> getSoiltemp10() {
        return soiltemp10;
    }
    public void setSoiltemp10(Optional<String> soiltemp10) {
        this.soiltemp10 = soiltemp10;
    }
    public Optional<String> getSoilhum1() {
        return soilhum1;
    }
    public void setSoilhum1(Optional<String> soilhum1) {
        this.soilhum1 = soilhum1;
    }
    public Optional<String> getSoilhum2() {
        return soilhum2;
    }
    public void setSoilhum2(Optional<String> soilhum2) {
        this.soilhum2 = soilhum2;
    }
    public Optional<String> getSoilhum3() {
        return soilhum3;
    }
    public void setSoilhum3(Optional<String> soilhum3) {
        this.soilhum3 = soilhum3;
    }
    public Optional<String> getSoilhum4() {
        return soilhum4;
    }
    public void setSoilhum4(Optional<String> soilhum4) {
        this.soilhum4 = soilhum4;
    }
    public Optional<String> getSoilhum5() {
        return soilhum5;
    }
    public void setSoilhum5(Optional<String> soilhum5) {
        this.soilhum5 = soilhum5;
    }
    public Optional<String> getSoilhum6() {
        return soilhum6;
    }
    public void setSoilhum6(Optional<String> soilhum6) {
        this.soilhum6 = soilhum6;
    }
    public Optional<String> getSoilhum7() {
        return soilhum7;
    }
    public void setSoilhum7(Optional<String> soilhum7) {
        this.soilhum7 = soilhum7;
    }
    public Optional<String> getSoilhum8() {
        return soilhum8;
    }
    public void setSoilhum8(Optional<String> soilhum8) {
        this.soilhum8 = soilhum8;
    }
    public Optional<String> getSoilhum9() {
        return soilhum9;
    }
    public void setSoilhum9(Optional<String> soilhum9) {
        this.soilhum9 = soilhum9;
    }
    public Optional<String> getSoilhum10() {
        return soilhum10;
    }
    public void setSoilhum10(Optional<String> soilhum10) {
        this.soilhum10 = soilhum10;
    }
    public Optional<String> getLeak1() {
        return leak1;
    }
    public void setLeak1(Optional<String> leak1) {
        this.leak1 = leak1;
    }
    public Optional<String> getLeak2() {
        return leak2;
    }
    public void setLeak2(Optional<String> leak2) {
        this.leak2 = leak2;
    }
    public Optional<String> getLeak3() {
        return leak3;
    }
    public void setLeak3(Optional<String> leak3) {
        this.leak3 = leak3;
    }
    public Optional<String> getLeak4() {
        return leak4;
    }
    public void setLeak4(Optional<String> leak4) {
        this.leak4 = leak4;
    }
    public Optional<String> getLightning_time() {
        return lightning_time;
    }
    public void setLightning_time(Optional<String> lightning_time) {
        this.lightning_time = lightning_time;
    }
    public Optional<String> getLightning_day() {
        return lightning_day;
    }
    public void setLightning_day(Optional<String> lightning_day) {
        this.lightning_day = lightning_day;
    }
    public Optional<String> getLightning_distance() {
        return lightning_distance;
    }
    public void setLightning_distance(Optional<String> lightning_distance) {
        this.lightning_distance = lightning_distance;
    }
    public Optional<String> getBattin() {
        return battin;
    }
    public void setBattin(Optional<String> battin) {
        this.battin = battin;
    }
    public Optional<String> getBatt1() {
        return batt1;
    }
    public void setBatt1(Optional<String> batt1) {
        this.batt1 = batt1;
    }
    public Optional<String> getBatt2() {
        return batt2;
    }
    public void setBatt2(Optional<String> batt2) {
        this.batt2 = batt2;
    }
    public Optional<String> getBatt3() {
        return batt3;
    }
    public void setBatt3(Optional<String> batt3) {
        this.batt3 = batt3;
    }
    public Optional<String> getBatt4() {
        return batt4;
    }
    public void setBatt4(Optional<String> batt4) {
        this.batt4 = batt4;
    }
    public Optional<String> getBatt5() {
        return batt5;
    }
    public void setBatt5(Optional<String> batt5) {
        this.batt5 = batt5;
    }
    public Optional<String> getBatt6() {
        return batt6;
    }
    public void setBatt6(Optional<String> batt6) {
        this.batt6 = batt6;
    }
    public Optional<String> getBatt7() {
        return batt7;
    }
    public void setBatt7(Optional<String> batt7) {
        this.batt7 = batt7;
    }
    public Optional<String> getBatt8() {
        return batt8;
    }
    public void setBatt8(Optional<String> batt8) {
        this.batt8 = batt8;
    }
    public Optional<String> getBatt9() {
        return batt9;
    }
    public void setBatt9(Optional<String> batt9) {
        this.batt9 = batt9;
    }
    public Optional<String> getBatt10() {
        return batt10;
    }
    public void setBatt10(Optional<String> batt10) {
        this.batt10 = batt10;
    }
    public Optional<String> getBattr1() {
        return battr1;
    }
    public void setBattr1(Optional<String> battr1) {
        this.battr1 = battr1;
    }
    public Optional<String> getBattr2() {
        return battr2;
    }
    public void setBattr2(Optional<String> battr2) {
        this.battr2 = battr2;
    }
    public Optional<String> getBattr3() {
        return battr3;
    }
    public void setBattr3(Optional<String> battr3) {
        this.battr3 = battr3;
    }
    public Optional<String> getBattr4() {
        return battr4;
    }
    public void setBattr4(Optional<String> battr4) {
        this.battr4 = battr4;
    }
    public Optional<String> getBattr5() {
        return battr5;
    }
    public void setBattr5(Optional<String> battr5) {
        this.battr5 = battr5;
    }
    public Optional<String> getBattr6() {
        return battr6;
    }
    public void setBattr6(Optional<String> battr6) {
        this.battr6 = battr6;
    }
    public Optional<String> getBattr7() {
        return battr7;
    }
    public void setBattr7(Optional<String> battr7) {
        this.battr7 = battr7;
    }
    public Optional<String> getBattr8() {
        return battr8;
    }
    public void setBattr8(Optional<String> battr8) {
        this.battr8 = battr8;
    }
    public Optional<String> getBattr9() {
        return battr9;
    }
    public void setBattr9(Optional<String> battr9) {
        this.battr9 = battr9;
    }
    public Optional<String> getBattr10() {
        return battr10;
    }
    public void setBattr10(Optional<String> battr10) {
        this.battr10 = battr10;
    }
    public Optional<String> getBatt_25() {
        return batt_25;
    }
    public void setBatt_25(Optional<String> batt_25) {
        this.batt_25 = batt_25;
    }
    public Optional<String> getBatt_25in() {
        return batt_25in;
    }
    public void setBatt_25in(Optional<String> batt_25in) {
        this.batt_25in = batt_25in;
    }
    public Optional<String> getBatleak1() {
        return batleak1;
    }
    public void setBatleak1(Optional<String> batleak1) {
        this.batleak1 = batleak1;
    }
    public Optional<String> getBatleak2() {
        return batleak2;
    }
    public void setBatleak2(Optional<String> batleak2) {
        this.batleak2 = batleak2;
    }
    public Optional<String> getBatleak3() {
        return batleak3;
    }
    public void setBatleak3(Optional<String> batleak3) {
        this.batleak3 = batleak3;
    }
    public Optional<String> getBatleak4() {
        return batleak4;
    }
    public void setBatleak4(Optional<String> batleak4) {
        this.batleak4 = batleak4;
    }
    public Optional<String> getBatt_lightning() {
        return batt_lightning;
    }
    public void setBatt_lightning(Optional<String> batt_lightning) {
        this.batt_lightning = batt_lightning;
    }
    public Optional<String> getBattsm1() {
        return battsm1;
    }
    public void setBattsm1(Optional<String> battsm1) {
        this.battsm1 = battsm1;
    }
    public Optional<String> getBattsm2() {
        return battsm2;
    }
    public void setBattsm2(Optional<String> battsm2) {
        this.battsm2 = battsm2;
    }
    public Optional<String> getBattsm3() {
        return battsm3;
    }
    public void setBattsm3(Optional<String> battsm3) {
        this.battsm3 = battsm3;
    }
    public Optional<String> getBattsm4() {
        return battsm4;
    }
    public void setBattsm4(Optional<String> battsm4) {
        this.battsm4 = battsm4;
    }
    public Optional<String> getBattrain() {
        return battrain;
    }
    public void setBattrain(Optional<String> battrain) {
        this.battrain = battrain;
    }
}

/*

1	MAC	Device Mac address. Colons included.	String Example, 00:0E:C6:00:07:10	 
 	 	 	 	 
Date and Time
2	dateutc	YYYY-MM-DD HH:MM:SS (mysql format)] In Universal Coordinated Time (UTC) Not local time	string	 

Measured Parameters
3	winddir	0-360º instantaneous wind direction	integer	º (degrees)
4	windspeedmph	instantaneous wind speed	float	mph
5	windgustmph	Instantaneous wind gust	float	mph
6	windgustdir	Wind direction at which the wind gust occurred, 0-360º	integer	º (degrees)
7	maxdailygust	Max daily gust	Float	mph
8	windspdmph_avg2m	Average wind speed, 2 minute average	float	mph
9	winddir_avg2m	Average wind direction, 2 minute average	integer	º (degrees)
10	windspdmph_avg10m	Average wind speed, 10 minute average	float	mph
11	winddir_avg10m	Average wind direction, 10 minute average	integer	º (degrees)
12	windgustmph_interval	Max Wind Speed in update interval, the default is one minute	integer	º (degrees)
13	humidity	Outdoor Humidity, 0-100%	integer	%
14	humidity1	Humidity 1, 0-100%	integer	%
15	humidity2	Humidity 2, 0-100%	integer	%
16	humidity3	Humidity 3, 0-100%	integer	%
17	humidity4	Humidity 4, 0-100%	integer	%
18	humidity5	Humidity 5, 0-100%	integer	%
19	humidity6	Humidity 6, 0-100%	integer	%
20	humidity7	Humidity 7, 0-100%	integer	%
21	humidity8	Humidity 8, 0-100%	integer	%
22	humidity9	Humidity 9, 0-100%	integer	%
23	humidity10	Humidity 10, 0-100%	integer	%
24	humidityin	Indoor Humidity, 0-100%	integer	%
25	tempf	Outdoor Temperature	float	ºF
26	temp1f	Temperature 1	float	ºF
27	temp2f	Temperature 2	float	ºF
28	temp3f	Temperature 3	float	ºF
29	temp4f	Temperature 4	float	ºF
30	temp5f	Temperature 5	float	ºF
31	temp6f	Temperature 6	float	ºF
32	temp7f	Temperature 7	float	ºF
33	temp8f	Temperature 8	float	ºF
34	temp9f	Temperature 9	float	ºF
35	temp10f	Temperature 10	float	ºF
36	tempinf	Indoor Temperature	float	ºF
37	hourlyrainin	Hourly Rain	float	in
38	dailyrainin	Daily Rain	float	in
39	24hourrainin	24 Hour Rain	float	in
40	weeklyrainin	Weekly Rain	float	in
41	monthlyrainin	Monthly Rain	float	in
42	yearlyrainin	Yearly Rain	float	in
43	eventrainin	Event Rain	float	in
44	totalrain	Total Rain	float	in
45	baromrelin	Relative Pressure	float	inHg
46	baromabsin	Absolute Pressure	float	inHg
47	uv	Ultra-Violet Radiation Index	Integer	 
48	solarradiation	Solar Radiation	Float	W/m^2
49	co2	CO2 Meter	int	ppm
50	pm25	PM2.5 Air Quality Sensor	int	µg/m3
51	pm25_24h	PM2.5 Air Quality Sensor, 24 hour running average	float	µg/m3
52	pm25_in	PM2.5 Air Quality Sensor, indoor	int	µg/m3
53	pm25_in_24h	PM2.5 Air Quality Sensor indoor, 24 hour running average	float	µg/m3
54	pm10_in	PM1.0 Air Quality Sensor	int	µg/m3
55	pm10_in_24h	PM1.0 Air Quality Sensor, 24 hour running average	float	µg/m3
56	co2_in	Indoor CO2	int	ppm
57	co2_in_24h	Indoor CO2, 24 hour running average	float	ppm
58	pm_in_temp	Indoor PM sensor temperature	float	ºF
59	pm_in_humidity	Indoor PM sensor humidity	int	%
60	relay1	Relay 1	discrete 0 or 1	 
61	relay2	Relay 2	discrete 0 or 1	 
62	relay3	Relay 3	discrete 0 or 1	 
63	relay4	Relay 4	discrete 0 or 1	 
64	relay5	Relay 5	discrete 0 or 1	 
65	relay6	Relay 6	discrete 0 or 1	 
66	relay7	Relay 7	discrete 0 or 1	 
67	relay8	Relay 8	discrete 0 or 1	 
68	relay9	Relay 9	discrete 0 or 1	 
69	relay10	Relay 10	discrete 0 or 1	 
70	soiltemp1	Soil Temperature 1	float	ºF
71	soilltemp2	Soil Temperature 2	float	ºF
72	soiltemp3	Soil Temperature 2	float	ºF
73	soiltemp4	Soil Temperature 3	float	ºF
734	soiltemp5	Soil Temperature 4	float	ºF
75	soiltemp6	Soil Temperature 5	float	ºF
76	soiltemp7	Soil Temperature 6	float	ºF
77	soiltemp8	Soil Temperature 7	float	ºF
78	soiltemp9	Soil Temperature 8	float	ºF
79	soiltemp10	Soil Temperature 9	float	ºF
80	soilhum1	Soil Moisture 1	integer	%
81	soilhum2	Soil Moisture 2	integer	%
82	soilhum3	Soil Moisture 3	integer	%
83	soilhum4	Soil Moisture 4	integer	%
84	soilhum5	Soil Moisture 5	integer	%
85	soilhum6	Soil Moisture 6	integer	%
86	soilhum7	Soil Moisture 7	integer	%
87	soilhum8	Soil Moisture 8	integer	%
88	soilhum9	Soil Moisture 9	integer	%
89	soilhum10	Soil Moisture 10	integer	%
90	leak1	Leak Detection 1	discrete 0 or 1 0=no leak 1=leak detected 2=loss of communication for over 10 minutes.	 
91	leak2	Leak Detection 2	discrete 0 or 1 0=no leak 1=leak detected 2=loss of communication for over 10 minutes.	 
92	leak3	Leak Detection 3	discrete 0 or 1 0=no leak 1=leak detected 2=loss of communication for over 10 minutes.	 
93	leak4	Leak Detection 4	discrete 0 or 1 0=no leak 1=leak detected 2=loss of communication for over 10 minutes.	 
94	lightning_time	Last strike date and time	Seconds since January 1, 1970	 
95	lightning_day	Number of strikes per day	count	 
96	lightning_distance	Distance of last strike	float	km

1	battout	Low battery indication, outdoor sensor array or suite	discrete 0 or 1	 
2	battin	Low battery indication, indoor sensor or console	discrete 0 or 1	 
3	batt1	Low battery indication, sensor 1	discrete 0 or 1	 
4	batt2	Low battery indication, sensor 2	discrete 0 or 1	 
5	batt3	Low battery indication, sensor 3	discrete 0 or 1	 
6	batt4	Low battery indication, sensor 4	discrete 0 or 1	 
7	batt5	Low battery indication, sensor 5	discrete 0 or 1	 
8	batt6	Low battery indication, sensor 6	discrete 0 or 1	 
9	batt7	Low battery indication, sensor 7	discrete 0 or 1	 
10	batt8	Low battery indication, sensor 8	discrete 0 or 1	 
11	batt9	Low battery indication, sensor 9	discrete 0 or 1	 
12	batt10	Low battery indication, sensor 10	discrete 0 or 1	 
13	battr1	Low battery indication, relay 1	discrete 0 or 1	 
14	battr2	Low battery indication, relay 2	discrete 0 or 1	 
15	battr3	Low battery indication, relay 3	discrete 0 or 1	 
16	battr4	Low battery indication, relay 4	discrete 0 or 1	 
17	battr5	Low battery indication, relay 5	discrete 0 or 1	 
18	battr6	Low battery indication, relay 6	discrete 0 or 1	 
19	battr7	Low battery indication, relay 7	discrete 0 or 1	 
20	battr8	Low battery indication, relay 8	discrete 0 or 1	 
21	battr9	Low battery indication, relay 9	discrete 0 or 1	 
22	battr10	Low battery indication, relay 10	discrete 0 or 1	 
23	batt_25	Low battery indication, PM2.5	discrete 0 or 1	 
24	batt_25in	Low battery indication, PM2.5 indoor	discrete 0 or 1	 
25	batleak1	Leak Detection, sensor 1	discrete 0 or 1	 
26	batleak2	Leak Detection, sensor 2	discrete 0 or 1	 
27	batleak3	Leak Detection, sensor 3	discrete 0 or 1	 
28	batleak4	Leak Detection, sensor 4	discrete 0 or 1	 
29	batt_lightning	Lighting detector battery	discrete 0 or 1	 
30	battsm1	Soil Moisture 1 battery	discrete 0 or 1	 
31	battsm2	Soil Moisture 2 battery	discrete 0 or 1	 
32	battsm3	Soil Moisture 3 battery	discrete 0 or 1	 
33	battsm4	Soil Moisture 4 battery	discrete 0 or 1	 
34	battrain	Rain Gauge battery	discrete 0 or 1
*/