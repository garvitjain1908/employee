package com.EmployeeApp.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dep")
@Primary
@Scope("prototype")
public class IT implements Departments {
	 

public String depInfo() {
	return "Information Techology";
}
}
