package com.kaushik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicController {
	
	@RequestMapping("/")
	public ModelAndView Firstcontroller()
	{
		
		ModelAndView mv=new ModelAndView("index");
	System.out.println("index controller called");
		
		
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView Secondcontroller()
	{
		
		ModelAndView mv=new ModelAndView("login");
	System.out.println("login controller called");
		
		
		return mv;
	}
	@RequestMapping("/carousel")
	public ModelAndView Thirdcontroller()
	{
		
		ModelAndView mv=new ModelAndView("carousel");
	System.out.println("carousel controller called");
		
		
		return mv;
	}
	
	@RequestMapping("/men")
	public ModelAndView Fourthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("men");
	System.out.println("men controller called");
		
		
		return mv;
	}
	@RequestMapping("/women")
	public ModelAndView Fifthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("women");
	System.out.println("women controller called");
		
		
		return mv;
	}
	
	@RequestMapping("/Child")
	public ModelAndView Sixthcontroller()
	{
		
		ModelAndView mv=new ModelAndView("Child");
	System.out.println("Child controller called");
		
		
		return mv;
	}
	@RequestMapping("/acc")
	public ModelAndView Seventhcontroller()
	{
		
		ModelAndView mv=new ModelAndView("acc");
	System.out.println("Accesories controller called");
		
		
		return mv;
	}
	

	
	
	@RequestMapping("/product")
	public ModelAndView Productcontroller()
	{
		
		ModelAndView mv=new ModelAndView("product");
	System.out.println("Product controller called");
		
		
		return mv;
	}
	

}
