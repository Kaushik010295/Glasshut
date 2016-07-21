package com.kaushik.glasshut.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryTest {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.kaushik");
		context.refresh();
		
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		
		category.seId("M001");
		category.setName("MEN");
		category.setDescription("ALL TYPES OF GLASSES FOR MEN");
		
		   categoryDAO.saveOrUpdate(category);

		   
		   if(categoryDAO.get("hjshs")== null)
		   {
			   System.out.println("Category does not exist");
		   }
		   else
		   {
			   System.out.println("Category exists, the details are");
			   System.out.println("");
			   
		   }
	}
}
