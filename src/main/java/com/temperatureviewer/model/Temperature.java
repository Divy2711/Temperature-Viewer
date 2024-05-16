package com.temperatureviewer.model;

public class Temperature {

	private int temperature;
	private String day;
	
	public Temperature() {}
	
	public Temperature(int t, String d) {
		temperature = t;
		day = d;
	}
	
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
	
}
