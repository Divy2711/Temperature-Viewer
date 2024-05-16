/**
 * 
 */
package com.temperatureviewer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.temperatureviewer.model.Temperature;
import com.temperatureviewer.service.TemperatureService;

@RestController
@RequestMapping("/temperatures")
public class TemperatureController {
	
	@Autowired
	private TemperatureService tempService;

	/**
	 * @param day
	 * @return Temperature
	 */

	@GetMapping("getTemperatureOfParticularDay/{day}")
	public Temperature getTemperatureOfParticularDay(@PathVariable("day") int day) {
		return tempService.getTemperatureOfParticularDay(day);
	}

	/**
	 * @return Temperature
	 */

	@GetMapping("getTemperatureOfTheDay")
	public Temperature getTemperatureOfTheDay() {
		return tempService.getTemperatureOfTheDay();
	}
	
	@GetMapping("getAllDaysTemperature")
	public List<Temperature> getAllDaysTemperature(){
		return tempService.getAlltemps();
	}

}
