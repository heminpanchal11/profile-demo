package com.spring.profiledemo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/forex")
public class ForexController {

	@Value("${spring.profiles.active}")
	String activeProfile;

	@Value("${forex.exchange.rate}")
	Double exchangeRate;

	@GetMapping("/")
	public Object getForexInformation() {
		HashMap<String, Object> response = new HashMap<String, Object>();
		response.put("activeProfile", activeProfile);
		response.put("exchangeRate", exchangeRate);
		return response;
	}
}
