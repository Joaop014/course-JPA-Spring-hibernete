package com.educandoweb.whorkshop.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.whorkshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
