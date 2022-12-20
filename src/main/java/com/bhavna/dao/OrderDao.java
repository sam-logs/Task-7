package com.bhavna.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhavna.model.Orders;

public interface OrderDao extends JpaRepository<Orders, Integer> {

	Optional<Orders> findByCategory(String category);

}
