package com.bhavna.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.dao.OrderDao;
import com.bhavna.exceptions.ResourceNotFoundException;
import com.bhavna.model.Orders;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao dao;

	@Override
	public Orders placeOrder(Orders order) {
		// TODO Auto-generated method stub
		Orders placeOrders = this.dao.save(order);
		return placeOrders;
	}

	@Override
	public List<Orders> getAllOrder() {
		// TODO Auto-generated method stub
		List<Orders> orders = this.dao.findAll();
		return orders;
	}

	public Orders updateOrder(Orders order, String category) {
		Orders update = this.dao.findByCategory(category)
				.orElseThrow(() -> new ResourceNotFoundException("Orders", "category", category));
		order.setCategory(order.getCategory());
		order.setOrderId(order.getOrderId());
		order.setPrice(order.getPrice());

		Orders updatedOrder = this.dao.save(update);
		return updatedOrder;
	}

	public Orders getOrderByCategory(String category) {
		Orders getOrder = this.dao.findByCategory(category)
				.orElseThrow(() -> new ResourceNotFoundException("Orders", "category", category));
		return getOrder;
	}

	public void deleteOrder(String category) {
		Orders delete = this.dao.findByCategory(category)
				.orElseThrow(() -> new ResourceNotFoundException("Orders", "category", category));
		this.dao.delete(delete);
	}

}
