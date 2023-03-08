package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Grocery;
import com.example.demo.Repositories.GroceryRepo;
import com.example.demo.Service.GroceryService;

@RestController
@CrossOrigin
public class GroceryController {
	@Autowired
	GroceryRepo repository;
	@Autowired
	GroceryService service;
	@GetMapping("/getvalues")
	List<Grocery>getList(){
		return repository.findAll();
	}
	@PutMapping("/grocery")
	public String update(@RequestBody Grocery t) {
		 return service.updateDetails(t);
	}
	@DeleteMapping("/delete/{Sno}")
	public String delete(@PathVariable int Sno) {
		 return service.deleteDetails(Sno);
	}
	@PostMapping("/post")
	public Grocery post(@RequestBody Grocery t) {
		return repository.save(t);
	}
}
