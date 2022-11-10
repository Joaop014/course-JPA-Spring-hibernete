package com.educandoweb.whorkshop.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.whorkshop.entities.OrderItem;
import com.educandoweb.whorkshop.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
