package com.cg.trainee.API;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.trainee.exception.TraineeException;

@RestControllerAdvice
public class ExceptionAdvisor {

	/*
	 * For Trainee Exception
	 */

	@ExceptionHandler(TraineeException.class)
	public ResponseEntity<String> handleOFDAExceptionAction(TraineeException excep) {
		return new ResponseEntity<>(excep.getMessage(), HttpStatus.BAD_REQUEST);
	}

	/*
	 * For internal server error
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleExceptionAction(Exception excep) {
		return new ResponseEntity<>(excep.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
