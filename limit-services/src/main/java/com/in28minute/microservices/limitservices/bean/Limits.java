package com.in28minute.microservices.limitservices.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Limits {
	
	private int maximum;
	private int minimum;

}
