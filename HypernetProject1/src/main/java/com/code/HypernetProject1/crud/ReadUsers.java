package com.code.HypernetProject1.crud;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.code.HypernetProject1.entity.Users;
import com.code.HypernetProject1.entity.Users.Role;

public class ReadUsers {
	

	
	private SessionFactory sessionFactory;
	
	public ReadUsers(SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
		
		Session session=sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		List<Users> users= session.createQuery("from Users").getResultList();
		for (Users user:users ) {
			System.out.println(user.toString());
			
		}
	
		
		session.close();
		

	}

}
