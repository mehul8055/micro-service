package com.mehul.training.springmvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mehul.training.model.EmployeeUtility;

@Controller
public class FirstController {
	
	@Autowired
	private EmployeeUtility employeeUtility;
	
	@RequestMapping("/first.req")
	public String getMessage(Map<String, Object> model)
	{
		model.put("message", "Welcome to Spring MVC");
		return "showMessage";
	}
	
	@RequestMapping("/emp.req")
	public String getEmployeeDetails(Map<String, Object> model,@RequestParam("emp_id") int id)
	{
		model.put("emp", employeeUtility.findEmployee(id));
		return "showEmployee";
	}

}
