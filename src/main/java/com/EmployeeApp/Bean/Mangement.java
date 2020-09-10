package com.EmployeeApp.Bean;

import org.springframework.stereotype.Component;

@Component
public class Mangement implements Departments {

	public String depInfo() {
		
		return "Management Department";
	}

}
