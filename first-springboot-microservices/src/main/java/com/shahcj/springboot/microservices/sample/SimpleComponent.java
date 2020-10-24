package com.shahcj.springboot.microservices.sample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class SimpleComponent {

	private String firstName;
	private String lastName;
	
	public String getName() throws InterruptedException {
		
		//Thread.sleep(2000);
		return this.getFirstName() + " " + this.getLastName();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
