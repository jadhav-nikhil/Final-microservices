package com.in28minute.microservices.limitservices.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

@ConfigurationProperties("limit-service")
@Component
@Data
public class LimitConfig {
	
	private int minimum;
	private int maximum;

}
