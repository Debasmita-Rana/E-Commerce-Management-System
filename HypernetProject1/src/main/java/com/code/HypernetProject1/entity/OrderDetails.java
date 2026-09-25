package com.code.HypernetProject1.entity;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="orderdetails_id")
	private int OrderDetailsId;
	@Column(name="quantity",nullable=false)
	private  int quantity;
	@Column(name="unit_price",precision=10, scale=2, nullable=false)
	private BigDecimal unitPrice;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private Orders orders;
	
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	
	public OrderDetails()
	{
		this.OrderDetailsId=0;
		this.quantity=0;
		this.unitPrice=null;
	}

	public OrderDetails(int quantity, BigDecimal unitPrice) {
		super();
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public int getOrderDetailsId() {
		return OrderDetailsId;
	}

	public void setOrderDetailsId(int orderDetailsId) {
		OrderDetailsId = orderDetailsId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderDetails [OrderDetailsId=" + OrderDetailsId + ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ "]";
	}
	
	

}
