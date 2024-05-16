package com.temperatureviewer.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class TemperatureBO {

	private List<Temperature> temps = new ArrayList<Temperature>();

	@Value("${DayOfWeek}")
	private int nextDay;

	/**
	 * @return List
	 */
	public List<Temperature> getTemps() {
		return temps;
	}

	public void setTemps(List<Temperature> temps) {
		this.temps = temps;
	}

	/**
	 * @return Integer
	 */
	public int getNextDay() {
		return nextDay;
	}

	public void setNextDay(int nextDay) {
		this.nextDay = nextDay;
	}

	public TemperatureBO() {
		temps.add(new Temperature(33, "Monday"));
		temps.add(new Temperature(34, "Tuesday"));
		temps.add(new Temperature(36, "Wednesday"));
		temps.add(new Temperature(36, "Thursday"));
		temps.add(new Temperature(37, "Friday"));
		temps.add(new Temperature(36, "Saturday"));
		temps.add(new Temperature(33, "Sunday"));
	}

	/**
	 * @return Temperature
	 */
	public Temperature getTemperatureOfTheDay() {
		
		nextDay=nextDay%7;
		
		Temperature temperature = temps.get(nextDay);
		nextDay = (nextDay+1) % 7;
		return temperature; 

	}

	/**
	 * @param day
	 * @return Temperature
	 */

	@Cacheable("temps")
	public Temperature getTemperatureOfParticularDay(int day) {
		
		try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		day=day%7-1;
		return temps.get(day);
	}
}
