/**
 * 
 */
package com.temperatureviewer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.temperatureviewer.model.Temperature;
import com.temperatureviewer.model.TemperatureBO;

@Service
public class TemperatureService {
	@Autowired
	private TemperatureBO temps;

	/**
	 * @return Temperature
	 */
	public Temperature getTemperatureOfTheDay() {
		return temps.getTemperatureOfTheDay();
	}

	/**
	 * @param day
	 * @return Temperature
	 */
	public Temperature getTemperatureOfParticularDay(int day) {

		return temps.getTemperatureOfParticularDay(day);
	}
	
	public List<Temperature> getAlltemps(){
		return temps.getTemps();
	}
}
