package com.temeratureviewer.service;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.temperatureviewer.config.TemperatureApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(
		classes = TemperatureApplication.class)

@AutoConfigureMockMvc
public class TemperatureTesting {
	
	@Autowired
	private MockMvc mvc;

	@Test
	public void getTempForWednesday() throws Exception {
		mvc.perform(get("/temperatures/nextDay")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect((ResultMatcher) jsonPath(("$.temperature")));
	}

}

