package se.joeldegerman.ithsdemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import se.joeldegerman.ithsdemo.entities.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer>{

	List<Car> getByModel(String model); 
	List<Car> getByBrand(String brand); 
	List<Car> getByColor(String brand); 
	
}
