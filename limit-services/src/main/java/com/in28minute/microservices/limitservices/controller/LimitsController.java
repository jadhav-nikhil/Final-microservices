package com.in28minute.microservices.limitservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minute.microservices.limitservices.bean.Limits;
import com.in28minute.microservices.limitservices.config.LimitConfig;

@RestController
public class LimitsController {
	
	@Autowired
	private LimitConfig config;

	@GetMapping("/")
	public Limits getLimit() {
		return new Limits(config.getMaximum(), config.getMinimum());

	}

}
