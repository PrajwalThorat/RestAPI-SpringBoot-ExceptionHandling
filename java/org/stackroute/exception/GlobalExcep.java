package org.stackroute.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExcep {


	@Value(value = "${data.exception.msg}")
	private String msg;
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<String> computerModelFoundException(ProductNotFoundException productNotFoundException){
		return new ResponseEntity<>(msg , HttpStatus.CONFLICT);
		
	}
}
