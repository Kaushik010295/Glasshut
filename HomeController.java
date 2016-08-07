package com.kaushik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kaushik.dao.UserDAO;
import com.kaushik.model.User;

@Controller
public class HomeController {
	@Autowired
	UserDAO userDAO;
	User user;
	
	
	@RequestMapping("/registration")
	public ModelAndView Eigthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("registration");
	System.out.println("Registration controller called");
		
		
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView Registercontroller(@ModelAttribute User user,
			@RequestParam(value = "firstname") String firstname,
			@RequestParam(value = "lastname") String lastname,
			@RequestParam(value = "username") String username,

			@RequestParam(value = "email") String email,
			@RequestParam(value = "pass") String password,
			@RequestParam(value = "confirmpass") String confirmpassword,
			@RequestParam(value = "phonenumber") String phonenumber

			)
	{
		user.setUfirstname(firstname);
		user.setUlastname(lastname);
		user.setUsername(username);

		user.setUemail(email);
		user.setUsername(username);	
		user.setUpassword(password);
		user.setUconfirmpassword(confirmpassword);

		ModelAndView mv=new ModelAndView("login");
	System.out.println("Register controller called");
		
		
		return mv;
	}
	
	
	
	 @RequestMapping("/isValidCredentials")
		public ModelAndView isValidUser(@RequestParam(value = "user") String name,
				@RequestParam(value = "pass") String password) {
			System.out.println("in controller");

			String message;
			ModelAndView mv ;
			if (userDAO.isValidCredentials(name,true,password)) 
			{
				message = "Valid credentials for Admin";
				 mv = new ModelAndView("adminlogin");
			} 
			else if(userDAO.isValidCredentials(name, false, password))
			{
				System.out.println("Page for user");
				message = "Valid credentials for User";
				 mv = new ModelAndView("carousel");
			}
			else
			{
				message = "Invalid credentials";
				 mv = new ModelAndView("login");
			}

			mv.addObject("message", message);
			mv.addObject("name", name);
			return mv;
		}
		

}
