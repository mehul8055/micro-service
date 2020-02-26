package com.mehul.training;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	@RequestMapping("/hello")
	public String getMsg()
	{
		return "hello world";
	}
}
