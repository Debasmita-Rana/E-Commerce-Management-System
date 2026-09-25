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
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int productId;
	@Column(name="product_name",length=50,nullable=false)
	private String ProductName;
	@Column(name="price",precision=10, scale=2, nullable=false)
	private BigDecimal price;
	@Column(name="stock_quantity", nullable=false)
	private int StockQuantity;
	
	@ManyToOne
	@JoinColumn(name ="category_id")
	private Category category;
	
	
	//default constructor
	public Product() {
		this.productId=0;
		this.ProductName=null;
		this.price=null;
		this.StockQuantity= 0; 
	
}
	//parameterized constructor

	public Product(String productName, BigDecimal price, int stockQuantity) {
		super();
		ProductName = productName;
		this.price = price;
		StockQuantity = stockQuantity;
	}
	//getter and setter

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getStockQuantity() {
		return StockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		StockQuantity = stockQuantity;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	//toString method

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", ProductName=" + ProductName + ", price=" + price
				+ ", StockQuantity=" + StockQuantity + "]";
	}
	
}
