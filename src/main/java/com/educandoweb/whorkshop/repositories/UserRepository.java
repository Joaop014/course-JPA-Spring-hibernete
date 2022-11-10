package com.educandoweb.whorkshop.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.whorkshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
