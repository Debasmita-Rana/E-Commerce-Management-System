package com.code.HypernetProject1.crud;



import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.code.HypernetProject1.entity.Category;

public class CreateCategory {
	

	
	private SessionFactory sessionFactory;
	
	public CreateCategory(SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
		//session object using the sessionfactory object
		Session session=sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		Category category=new Category("toothpaste", "brushing teeth");
	
		
		session.persist(category);
		
		 category=new Category("shampoo", "washing hair");
		 session.persist(category);
		 
		 category=new Category("soap", "soap");
		 session.persist(category);
	
		
		
		session.getTransaction().commit();
		
		session.close();
		
		System.out.println("Category is added successfully");
	}

}
