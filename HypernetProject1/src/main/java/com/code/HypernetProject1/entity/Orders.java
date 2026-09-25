package com.code.HypernetProject1.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	private int OrderId;
	@Column(name="order_date",nullable=false)
	private LocalDateTime OrderDate;
	@Column(name="total_amount",precision=10, scale=2, nullable=false)
	private BigDecimal TotalAmount;
	
	@ManyToOne
	@JoinColumn(name ="user_id")
	private Users users;
	
	@OneToMany(mappedBy = "orders",cascade = CascadeType.ALL)
	private List<OrderDetails> orderDetails=new ArrayList<>();
	
	
	public List<OrderDetails> getOrderDetails(){
		return orderDetails;
	}
	
	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	//default constructor
	public Orders() {
		this.OrderId=0;
		this.OrderDate=null;
		this.TotalAmount=null;
	}

	public Orders(LocalDateTime orderDate, BigDecimal totalAmount, Users users) {
		super();
		OrderDate = orderDate;
		TotalAmount = totalAmount;
		this.users = users;
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public LocalDateTime getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		OrderDate = orderDate;
	}

	public BigDecimal getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		TotalAmount = totalAmount;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	

	@Override
	public String toString() {
		return "Orders [OrderId=" + OrderId + ", OrderDate=" + OrderDate + ", TotalAmount=" + TotalAmount + ", users="
				+ users + "]";
	}
	
	


}
