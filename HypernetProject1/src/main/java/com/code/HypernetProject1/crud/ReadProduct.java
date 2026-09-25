package com.code.HypernetProject1.crud;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.code.HypernetProject1.entity.Category;
import com.code.HypernetProject1.entity.Product;

public class ReadProduct {
	

	
	private SessionFactory sessionFactory;
	
	public ReadProduct(SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
		//session object using the sessionfactory object
		Session session=sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		List<Product> products= 
				session.createQuery("from Product").getResultList();
		for(Product product:products) {
			System.out.println(product.toString());
		}
	
		
		
		session.getTransaction().commit();
		
		session.close();
		
		
	}

}
