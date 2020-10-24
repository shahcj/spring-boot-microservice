package com.shahcj.springboot.microservices.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SimpleUtility {

	@Bean
	public SimpleBean simpleBean() {
		
		return new SimpleBean();
	}
}
