package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository repo;
	
	//localhost:8080/customers
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		List<Customer> customers = repo.findAll();
		return customers;
		
	}
	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable int id) {
		Customer customer = repo.findById(id).get();
		return customer;
	}
	
	@PostMapping("/customers/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createCustomer(@RequestBody Customer customer) {
		repo.save(customer);
	}
	
	@PutMapping("/customers/update/{id}")
	public Customer updateCustomer(@PathVariable int id) {
		Customer customer =repo.findById(id).get();
		customer.setCusName("indhu");
		customer.setLocation("coimbatore");
		repo.save(customer);
		return customer;
	}
		
	@DeleteMapping("/customer/delete/{id}")
	public void removeCustomer(@PathVariable int id) {
		Customer customer  = repo.findById(id).get();
		repo.delete(customer);
		
	
		
	}
}
