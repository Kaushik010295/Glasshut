package com.kaushik.glasshut.dao;

import java.util.List;

import com.kaushik.glasshut.config.Category;

interface CategoryDAO {
	
	
	public List<Category> list();
	
	public void get(String id);
	
	public void saveOrUpdate(Category category);
	
	public void delete(String id);

}
