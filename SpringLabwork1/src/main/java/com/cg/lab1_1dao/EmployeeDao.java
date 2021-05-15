package com.cg.lab1_1dao;

//DAO design pattern is a way to reduce coupling between Business logic and Persistence logic. 
import com.cg.lab1_1entities.Employee;

public interface EmployeeDao {
	public Employee displayEmployeeDetails();
}
