package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GenericController
{
	@RequestMapping("/home")
	public String homePage()
	{
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contactUs(@RequestParam(value="email", required=false)String email,
			@RequestParam(value="message", required=false)String message)
	{
		return "contact";
	}
}
