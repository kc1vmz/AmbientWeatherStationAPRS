package com.kc1vmz.ambientweatheragent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AmbientWeatherReporterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmbientWeatherReporterApplication.class, args);
	}

}
