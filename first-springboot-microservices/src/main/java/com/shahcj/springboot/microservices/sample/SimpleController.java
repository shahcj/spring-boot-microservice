package com.shahcj.springboot.microservices.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    
	@Value("${spring.application.name}")
    String appName;
 
	@Autowired
	SimpleService simpleService;
	
    @GetMapping("/home")
    public String homePage(@RequestParam(name = "requestId") String requestId
    		, @RequestParam(name = "firstName") String firstName
    		, @RequestParam(name = "lastName") String lastName) throws InterruptedException {
            	
		Thread.sleep(Integer.parseInt(requestId));
    	
    	String str = Thread.currentThread().getId() 
    			+ "<br/>Inside Controller: " 
    			+ this.toString()
    			+ ", for request id: " + requestId;

    	str += simpleService.callService(requestId, firstName, lastName);
    	
    	return "Welcome to " + appName + ", <br/>Thread: " + str;
    }
}