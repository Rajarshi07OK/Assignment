package com.Assignment.training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String loginPage()
	{
	
		return "login.jsp";
	}
	
	@PostMapping("/home")
	public String home()
	{
		System.out.println("****************************");
		
		return "home.jsp";
	}
	
	@PostMapping("/register")
	public String register(HttpServletRequest request){
		String empId = request.getParameter("empId");
		System.out.println("Emp Id : "+empId);
		return "home.jsp";
	}
	
}
