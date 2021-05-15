package com.cg.labassignment1_4main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.labassignment1_4config.MyConfig;

import com.cg.labassignment1_4service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		EmployeeServiceImpl empService = (EmployeeServiceImpl) context.getBean(EmployeeServiceImpl.class);
		System.out.println("Employee Info :");
		System.out.println(empService.retrieveEmployeeInformation(1));
	}

}
