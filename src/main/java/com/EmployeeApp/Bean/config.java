package com.EmployeeApp.Bean;

import java.util.Base64;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan( basePackages={"com.EmployeeApp.Bean","com.EmployeeApp.Service",})
@PropertySource("classpath:Employee.properties")
public class config {
   /*  @Bean("emp")
     public Employee emp(int id,String name)
     {
    	 Employee emp=new Employee(id,name);
    	         new Employee(dep());
    	 return emp;
    	 
     }
     @Bean("dep")
     public IT dep()
     {
    	 return new IT();
     }*/
     
     
}
