package com.bhavna.service;

import java.util.List;

import com.bhavna.model.Orders;

public interface OrderService {

	Orders placeOrder(Orders order);

	List<Orders> getAllOrder();

	Orders updateOrder(Orders order, String category);

	void deleteOrder(String category);

	Orders getOrderByCategory(String category);

}
