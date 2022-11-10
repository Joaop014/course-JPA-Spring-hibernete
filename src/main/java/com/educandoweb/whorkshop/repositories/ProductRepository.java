package com.educandoweb.whorkshop.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.whorkshop.entities.Category;
import com.educandoweb.whorkshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
