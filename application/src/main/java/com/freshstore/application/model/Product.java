package com.freshstore.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@Column(name="Product_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long Product_ID;
	
	public String Product_Name;
	public String Description;
	public String Category;
	public Integer Available_Quantity;
	public Integer Price;
	
	public long getProduct_ID() {
		return Product_ID;
	}
	public void setProduct_ID(Integer product_ID) {
		Product_ID = product_ID;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public Integer getAvailable_Quantity() {
		return Available_Quantity;
	}
	public void setAvailable_Quantity(Integer available_Quantity) {
		Available_Quantity = available_Quantity;
	}
	public Integer getPrice() {
		return Price;
	}
	public void setPrice(Integer price) {
		Price = price;
	}
	

}
