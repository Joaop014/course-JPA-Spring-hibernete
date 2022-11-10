package com.educandoweb.whorkshop.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.whorkshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
