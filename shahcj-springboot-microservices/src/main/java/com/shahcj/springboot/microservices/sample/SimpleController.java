package com.shahcj.springboot.microservices.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    
	@Value("${spring.application.name}")
    String appName;
 
    @GetMapping("/home")
    public String homePage(Model model) {
        
    	return "Welcome to " + appName;
    }
}