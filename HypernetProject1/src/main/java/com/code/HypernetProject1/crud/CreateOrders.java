package com.code.HypernetProject1.crud;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.code.HypernetProject1.entity.OrderDetails;
import com.code.HypernetProject1.entity.Orders;
import com.code.HypernetProject1.entity.Product;
import com.code.HypernetProject1.entity.Users;
import com.code.HypernetProject1.entity.Users.Role;

public class CreateOrders {
	

	
	private SessionFactory sessionFactory;
	
	public CreateOrders(SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
		
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Users user=session.get(Users.class, 1);
		
		Product product1=session.get(Product.class, 1);
		Product product2=session.get(Product.class, 2);
		
		if (user == null || product1 == null || product2 == null) {
            System.out.println("Error: User or Products not found in the database.");
            session.getTransaction().rollback();
            session.close();
            return;
        }
		
		Orders order=new Orders(LocalDateTime.now(), new BigDecimal("130.00"), user);
		
		// First Order Detail
        OrderDetails orderdetails = new OrderDetails(1, product1.getPrice());
        orderdetails.setOrders(order);
        orderdetails.setProduct(product1);
        
     // Second Order Detail
        OrderDetails orderdetail1 = new OrderDetails(1,product2.getPrice());
        orderdetail1.setOrders(order);
        orderdetail1.setProduct(product2);
        
     // Create a list of OrderDetails
        List<OrderDetails> orderdetailsList = new ArrayList<>();

        orderdetailsList.add(orderdetails);
        orderdetailsList.add(orderdetail1);
        
     // Connect OrderDetails to the Order
        order.setOrderDetails(orderdetailsList);
		
		session.persist(order);
		
		session.getTransaction().commit();
		
		session.close();
		
		System.out.println("Order with multiple orderdetails is added successfully");
	}

}
