package com.cg.labassignment1_4dao;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.labassignment1_4entities.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	HashMap<Integer, Employee> hmap = new HashMap<Integer, Employee>();
	
	@Autowired
	private Employee employee;

	public Employee retrieveEmployeeInformation(int employeeId) {
		Employee emp = hmap.put(1, employee);
		emp = hmap.get(employeeId);
		return emp;

	}

}
