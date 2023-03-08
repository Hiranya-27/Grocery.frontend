package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Grocery;
import com.example.demo.Repositories.GroceryRepo;

@Service
public class GroceryService {
	@Autowired
	GroceryRepo repository;
	public Optional<Grocery> getGrocerydetail(int id){
		return repository.findById(id);
	}
	public String updateDetails(Grocery t) {
		repository.save(t);
		return "updated";
	}
	public String deleteDetails(int Sno) {
		repository.deleteById(Sno);
		return "Id deleted";
	}
}
