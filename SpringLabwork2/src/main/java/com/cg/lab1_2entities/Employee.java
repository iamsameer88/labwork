package com.cg.lab1_2entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("40")
	private int age;
	
	@Value("12345")
	private int employeeId;
	
	@Value("Harriet")
	private String employeeName;
	
	@Value("40000")
	private double salary;
	
	@Value("PES-BU")
	private String businessUnit;

	@Autowired
	private Sbu sbu;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public Sbu getSbu() {
		return sbu;
	}

	public void setSbu(Sbu sbu) {
		this.sbu = sbu;
	}
	
	public Sbu getSbuDetails() {
		return sbu;

	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary="
				+ salary + ", businessUnit=" + businessUnit + "]";
	}

}
