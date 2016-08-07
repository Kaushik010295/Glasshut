package com.kaushik.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.kaushik.model.Supplier;

public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	private SessionFactory sessionFactory;


	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Supplier> list() {
		List<Supplier> listSupplier = (List<Supplier>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Supplier.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listSupplier;
		
		
	}

	@Transactional
    public Supplier get(int sid) {
		String hql = "from Supplier where id=" + "'"+ sid +"'";
		//  from category where id = '101'
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Supplier> listSupplier = (List<Supplier>) query.list();
		
		if (listSupplier != null && !listSupplier.isEmpty()) {
			return listSupplier.get(0);
		}
		return null;
		
	}

	@Transactional
     public void saveOrUpdate(Supplier supplier) {
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);

		
	}

	@Transactional
     public void delete(int sid) {
		Supplier supplier=new Supplier();
		supplier.setSid(sid);
		sessionFactory.getCurrentSession().delete(supplier);
		
	}

}
