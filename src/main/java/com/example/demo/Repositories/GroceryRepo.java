package com.example.demo.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Grocery;

public interface GroceryRepo extends JpaRepository<Grocery,Integer> {

	

}
