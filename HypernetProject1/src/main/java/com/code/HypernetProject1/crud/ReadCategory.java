package com.code.HypernetProject1.crud;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.code.HypernetProject1.entity.Category;
import com.code.HypernetProject1.entity.Product;

public class ReadCategory {
	

	
	private SessionFactory sessionFactory;
	
	public ReadCategory(SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
		//session object using the sessionfactory object
		Session session=sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		List<Category> categories= 
				session.createQuery("from Category").getResultList();
		for(Category category:categories) {
			System.out.println(category.toString());
		}
	
		
		
		session.getTransaction().commit();
		
		session.close();
		
		
	}

}
