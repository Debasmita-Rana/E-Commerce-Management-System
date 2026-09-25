package com.code.HypernetProject1.crud;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.code.HypernetProject1.entity.Orders;
import com.code.HypernetProject1.entity.Users;
import com.code.HypernetProject1.entity.Users.Role;

public class ReadOrders {
	

	
	private SessionFactory sessionFactory;
	
	public ReadOrders(SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
		
		Session session=sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		List<Orders> orders= session.createQuery("from Orders").getResultList();
		for (Orders order:orders ) {
			System.out.println(orders.toString());
			
		}
	
		
		session.close();
		

	}

}
