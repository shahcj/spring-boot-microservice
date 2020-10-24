package com.shahcj.springboot.microservices.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
public class SimpleService {

	@Autowired
	private SimpleComponent simpleComponent;
	
	@Autowired
	private SimpleBean simpleBean;

	public String callService(String requestId, String firstName, String lastName) throws InterruptedException {
		
		//Thread.sleep(3000);
		
		simpleComponent.setFirstName(firstName);
		simpleComponent.setLastName(lastName);
		
    	String str = Thread.currentThread().getId() 
    				+ "<br/>Inside Service: " 
    				+ this.toString()
    				+ ", for requestId: " + requestId
    				+ "Name: " + firstName + " " + lastName
    				+ ", Name: " + simpleComponent.getName()
    				+ ", Component Id: " + simpleComponent.toString()
    				+ ", SimpleBean: " + simpleBean.toString();
		
		return str;
	}
}
