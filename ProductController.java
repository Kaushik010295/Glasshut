package com.kaushik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kaushik.model.Product;
import com.kaushik.service.ProductService;


@Controller
public class ProductController {
	@Autowired
	Product product;
	ProductService productService;
	
	
	@RequestMapping("/productupdate")
	public ModelAndView ProductUpdateController(@ModelAttribute Product product,
			@RequestParam(value = " pname") String pname,
			@RequestParam(value = "pdescription") String pdescription,
			@RequestParam(value = "price") double price)
	{
		product.setPname(pname);
		product.setPdescription(pdescription);
		product.setPrice(price);
		
		productService.saveOrUpdate(product);
         System.out.println(pname);
		
		ModelAndView mv=new ModelAndView("editproduct");
		System.out.println("Product controller called");
		return mv;
		
		
	}

	
	
	

}
