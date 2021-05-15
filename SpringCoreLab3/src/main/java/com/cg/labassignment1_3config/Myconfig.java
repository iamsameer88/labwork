package com.cg.labassignment1_3config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.labassignment1_3entities.Employee;

/*Annotating a class with the @Configuration indicates that the class can be used by the Spring IoC container as a source of bean definitions.*/
@Configuration
@ComponentScan("com.cg")
public class Myconfig {

//	@Bean	
//	public Employee getEmployeObj()
//	{
//		Employee employee=new Employee();
//		return employee;
//	}
}