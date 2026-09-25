package com.code.HypernetProject1.crud;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.code.HypernetProject1.entity.Category;
import com.code.HypernetProject1.entity.Product;

public class CreateProduct {
	

	
	private SessionFactory sessionFactory;
	
	public CreateProduct(SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
		//session object using the sessionfactory object
		Session session=sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		Category Colgate= session.get(Category.class, 1);
		
		Product product=new Product("Colgate", new BigDecimal("50.00"), 5);
		product.setCategory(Colgate);
		session.persist(product);
		
		Category loreal= session.get(Category.class, 2);
		
		 product=new Product("loreal", new BigDecimal("150.00"), 5);
		 product.setCategory(loreal);
		 session.persist(product);
		 
		 Category dove= session.get(Category.class, 3);
		 product=new Product("dove", new BigDecimal("70.00"), 5);
		 product.setCategory(dove);
		 session.persist(product);
	
		
		
		session.getTransaction().commit();
		
		session.close();
		
		System.out.println("Product is added successfully");
	}

}
