package com.code.HypernetProject1.crud;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.code.HypernetProject1.entity.Users;
import com.code.HypernetProject1.entity.Users.Role;

public class CreateUsers {
	

	
	private SessionFactory sessionFactory;
	
	public CreateUsers(SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
		
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Users user=new Users("Mayukh", "1234", "m@gmail.com", Role.Customer);
		 session.persist(user);
		 
		 user=new Users("Debasmita", "3456", "d@gmail.com", Role.Admin);
		 session.persist(user);
		 user=new Users("Riya", "5678", "r@gmail.com", Role.Customer);
		 session.persist(user);
		 session.getTransaction().commit();
		
		session.close();
		
		System.out.println("User is added successfully");
	}

}
