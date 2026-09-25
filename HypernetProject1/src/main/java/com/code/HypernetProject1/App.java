package com.code.HypernetProject1;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.HypernetProject1.crud.CreateCategory;
import com.code.HypernetProject1.crud.CreateOrderDetails;
import com.code.HypernetProject1.crud.CreateOrders;
import com.code.HypernetProject1.crud.CreateProduct;
import com.code.HypernetProject1.crud.CreateUsers;
import com.code.HypernetProject1.crud.ReadCategory;
import com.code.HypernetProject1.crud.ReadOrderDetails;
import com.code.HypernetProject1.crud.ReadOrders;
import com.code.HypernetProject1.crud.ReadProduct;
import com.code.HypernetProject1.crud.ReadUsers;
import com.code.HypernetProject1.entity.Category;
import com.code.HypernetProject1.entity.OrderDetails;
import com.code.HypernetProject1.entity.Orders;
import com.code.HypernetProject1.entity.Product;
import com.code.HypernetProject1.entity.Users;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
 SessionFactory  sessionFactory=   new Configuration().configure("hibernate.cfg.xml")
    								.addAnnotatedClass(Category.class)
    								.addAnnotatedClass(Product.class)
    								.addAnnotatedClass(Users.class)
    								.addAnnotatedClass(Orders.class)
    								.addAnnotatedClass(OrderDetails.class)
    								.buildSessionFactory();
 
 //new CreateCategory(sessionFactory);
 //new ReadCategory(sessionFactory);
 //new CreateUsers(sessionFactory);
 //new CreateProduct(sessionFactory);
 //new ReadProduct(sessionFactory);
 //new ReadUsers(sessionFactory);
 //new CreateOrders(sessionFactory);
 new ReadOrders(sessionFactory);
 
   
    }
}
