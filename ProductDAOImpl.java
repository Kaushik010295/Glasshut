package com.kaushik.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.kaushik.model.Product;

public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;


	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Product> list() {
		
		List<Product> listProduct = (List<Product>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listProduct;
		
	}

	@Transactional
    public Product get(int pid) {
		

		String hql = "from Product where id=" + "'"+ pid +"'";
		//  from Product where id = '101'
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>) query.list();
		
		if (listProduct != null && !listProduct.isEmpty()) {
			return listProduct.get(0);
		}
		return null;

		
	
	}

	@Transactional
     public void saveOrUpdate(Product product) {
		 
		sessionFactory.getCurrentSession().saveOrUpdate(product);

		
		
	}

	@Transactional
    public void delete(int pid) {
		Product product=new Product();
		product.setPid(pid);
		sessionFactory.getCurrentSession().delete(product);
		
	}

	
	
	
}
