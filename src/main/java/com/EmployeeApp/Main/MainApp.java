package com.EmployeeApp.Main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.EmployeeApp.Bean.Employee;
import com.EmployeeApp.Bean.config;
import com.EmployeeApp.Service.AppService;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("Employee Application");
		 Scanner sc=new Scanner(System.in);
		 ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		 Employee emp=(Employee)context.getBean("emp");
		 /*AppService serv=(AppService)context.getBean("service");
		 int i=0;
		while(i<5)
		{    
			System.out.println("choose the Operation");
			System.out.println("1. Create Employee");
			System.out.println("2. Show All Employee");
			System.out.println("3. Search Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. exit");
			i=sc.nextInt();
			switch(i)
			{
			case 1:  serv.createEmp();
			         break;
			case 2:  serv.showAllEmp();
	          		 break;
			case 3:  System.out.println("enter employee id for search");
				     int id=sc.nextInt();
				     serv.showEmp(id);
	         	     break;
			case 4:  System.out.println("enter employee id for delete");
				     int id1=sc.nextInt();
				     serv.deleteEmp(id1);
	                    break;
			case 5:  System.out.println("App clossing");break;
			}
		}*/
		
	}

}
