package org.stackroute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.stackroute.exception.ProductNotFoundException;
import org.stackroute.model.Computer;
import org.stackroute.services.ComService;

@RestController
@RequestMapping("api/v1/computer")
public class ComController {

	private ComService comService;
	
	@Autowired
	public ComController(ComService comService) {
		this.comService = comService;
	}
	
	@GetMapping
	public ResponseEntity<List<Computer>> listAllComputer(){
		return new ResponseEntity<>(comService.getListAllComputer() , HttpStatus.FOUND);
	}
	
	@PostMapping
	public ResponseEntity<Computer> saveModel(@RequestBody Computer computer) throws ProductNotFoundException{
		return new ResponseEntity<>(comService.addModel(computer) , HttpStatus.ACCEPTED);	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Computer> getByComputerId(@PathVariable int computerId){
		return new ResponseEntity<>(comService.getComputerById(computerId) , HttpStatus.FOUND);
	}
}
