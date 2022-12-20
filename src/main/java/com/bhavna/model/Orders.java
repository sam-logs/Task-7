package com.bhavna.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Orders {

	private String category;
	@Id
	private int orderId;
	private double price;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Orders(String category, int orderId, double price) {
		super();
		this.category = category;
		this.orderId = orderId;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [category=" + category + ", orderId=" + orderId + ", price=" + price + "]";
	}

	public Orders() {
		super();
	}

}
