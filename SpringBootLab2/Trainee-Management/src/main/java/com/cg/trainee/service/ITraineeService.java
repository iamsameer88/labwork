package com.cg.trainee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.trainee.exception.TraineeException;
import com.cg.trainee.model.TraineeModel;

@Service
public interface ITraineeService {
	/* Definition of addTrainee method for adding the Trainee */
	public TraineeModel addTrainee(TraineeModel Trainee) throws TraineeException;

	/* Definition of updatingTrainee method for updating the Trainee */
	public TraineeModel updateTrainee(TraineeModel Trainee) throws TraineeException;

	/* Definition of removeTrainee method for removing the Trainee */
	public boolean removeTrainee(Long TraineeId) throws TraineeException;

	/* Definition of viewTrainee method for viewing the required Trainee */
	public TraineeModel viewTraineeByName(String Name) throws TraineeException;

	public TraineeModel viewTraineeById(Long TraineeId) throws TraineeException;

	/*
	 * Definition of viewTrainees method for viewing all the Trainees
	 */
	public List<TraineeModel> viewAllTrainees() throws TraineeException;

}
