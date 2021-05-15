package com.cg.trainee.exception;

public class TraineeException extends Exception {
	private static final long serialVersionUID = 1L;

	/* UserDefined Exception for trainee */
	public TraineeException(String errorMessege) {
		super(errorMessege);
	}
}
