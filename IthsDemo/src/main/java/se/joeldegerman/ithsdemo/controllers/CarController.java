package se.joeldegerman.ithsdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import se.joeldegerman.ithsdemo.entities.Car;
import se.joeldegerman.ithsdemo.repositories.CarRepository;

@RestController
@RequestMapping("car")
public class CarController {
	
	@Autowired
	CarRepository repository;

	@GetMapping("all-cars")
	public List<Car> getCars(){
		return (List<Car>) repository.findAll();
	}
	
	@GetMapping("{id}")
	public Car getCarById(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
	
	public List<Car> getCarByModel(@PathVariable String model){
		return repository.getByModel(model);
	}
	
}
