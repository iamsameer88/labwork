package com.cg.labassignment1_3main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.labassignment1_3config.Myconfig;
import com.cg.labassignment1_3entities.Employee;
import com.cg.labassignment1_3entities.Sbu;
import com.cg.labassignment1_3service.ServiceClass;

//Presentation layer would be responsible for handling all user interface and browser communication logic.
public class Main {
	
	Sbu sbu;

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		Class configurationClass = Myconfig.class;
		context.register(configurationClass);
		context.refresh();

		 Sbu sbu=context.getBean(Sbu.class);
		//to create an another object of employee
		Employee employee = context.getBean(Employee.class);

		employee.setEmployeeId(12346);
		employee.setEmployeeName("Ramesh");
		employee.setSalary(56000.2);


		ServiceClass service = context.getBean(ServiceClass.class);

		System.out.println("SBU Details ");
		System.out.println("-------------------------------");
		System.out.println("SBU Code="+sbu.getSbuId()+" SBU name="+sbu.getSbuName()+" SBU salary"+sbu.getSbuHead());
		System.out.println("Employee Details");
		System.out.println("---------------------------------------------------------------------------------");
		
		/**
		 * to add new object in list
		 */
		service.addEmployee(employee);
		
		/**
		 * service.addEmployee(employee2);
		 */
		System.out.println(sbu.getList());
	}

}


