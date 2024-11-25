package com.bandiclasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiclasses.DMS.Models.Dog;


/**
 *  @author S572549 [Sai Acyuth Konda] 
 */

public interface DogRepository extends CrudRepository<Dog , Integer> {
	List<Dog> findByName(String Name);
	

}
