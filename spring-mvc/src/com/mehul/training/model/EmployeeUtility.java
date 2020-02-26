package com.mehul.training.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class EmployeeUtility {
	private Map<Integer, Employee> list=new HashMap<>();
	
	public EmployeeUtility()
	{
		list.put(1001, new Employee(1001, "Arvind", "Accountant"));
		list.put(1002, new Employee(1002, "Deva", "Architect"));
		list.put(1003, new Employee(1003, "Syed", "Team Lead"));
	}
	
	public Employee findEmployee(int id)
	{
		return list.get(id);
	}

}
