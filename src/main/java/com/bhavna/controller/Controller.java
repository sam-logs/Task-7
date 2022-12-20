package com.bhavna.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.model.Orders;
import com.bhavna.response.ErrorResponse;
import com.bhavna.service.OrderService;

@RestController
public class Controller {

	@Autowired
	private OrderService orderService;

	@PostMapping("/save")

	public ResponseEntity<Orders> createUser(@RequestBody Orders order) {
		Orders createOrder = this.orderService.placeOrder(order);
		return new ResponseEntity<>(createOrder, HttpStatus.CREATED);

	}

	@PutMapping("update/{category}")
	public ResponseEntity<Orders> updateUser(@RequestBody Orders order, @PathVariable String category) {
		Orders updatedUser = this.orderService.updateOrder(order, category);
		return ResponseEntity.ok(updatedUser);
	}

		@DeleteMapping("delete/{category}")
	public ResponseEntity<ErrorResponse> deleteUser(@PathVariable String category) {
		this.orderService.deleteOrder(category);
		return new ResponseEntity<ErrorResponse>(new ErrorResponse("User Deleted Succesfully", true), HttpStatus.OK);

	}

	@GetMapping("/")
	public ResponseEntity<List<Orders>> getAllOrders() {
		return ResponseEntity.ok(this.orderService.getAllOrder());

	}

	@GetMapping("get/{category}")
	public ResponseEntity<Orders> getSingleOrder(@PathVariable String category) {
		return ResponseEntity.ok(this.orderService.getOrderByCategory(category));

	}

}
