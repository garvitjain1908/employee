package com.EmployeeApp.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.EmployeeApp.Bean.config;
import com.EmployeeApp.Bean.Employee;

@Service("service")
public class AppService {
     ArrayList<Employee> empList=new ArrayList<Employee>();
     AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(config.class);
	public void createEmp()
	{   Scanner sc=new Scanner(System.in);
	    System.out.println("enter employe id");
		int id=sc.nextInt();
		System.out.println("enter employee name");
		String name=sc.nextLine();
		
	   empList.add((Employee)context.getBean("emp",id,name));
		
	}
    public void showAllEmp()
    {
        Iterator<Employee> it=empList.iterator();
        while(it.hasNext())
        {
        	Employee emp=it.next();
        	emp.toString();
        }
    			
    }
    public void showEmp(int id)
    {
        Iterator<Employee> it=empList.iterator();
        while(it.hasNext())
        {
        	Employee emp=it.next();
        	if(emp.geteId()==id)
        		emp.toString();
        }
    			
    }
    public void deleteEmp(int id)
    {
        Iterator<Employee> it=empList.iterator();
        while(it.hasNext())
        {
        	Employee emp=it.next();
        	if(emp.geteId()==id)
        	{
        		empList.remove(emp);
        	}
        }
    			
    }
	
}
