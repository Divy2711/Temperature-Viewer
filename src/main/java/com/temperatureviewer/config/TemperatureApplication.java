package com.temperatureviewer.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan({"com.temperatureviewer.config,com.temperatureviewer.controller,com.temperatureviewer.model,com.temperatureviewer.service"})
public class TemperatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureApplication.class, args);
	}
}
