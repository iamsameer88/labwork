package com.cg.trainee.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.trainee.exception.TraineeException;
import com.cg.trainee.model.TraineeModel;
import com.cg.trainee.service.ITraineeService;

@RestController
@RequestMapping(path = "/trainees")
public class TraineeRestContoller {

	/*
	 * Trainee Service is Autowired
	 */

	@Autowired
	private ITraineeService traineeService;

	/*
	 * to add aTrainee return :Trainee params : NIL
	 */
	@PostMapping
	public ResponseEntity<TraineeModel> addTrainee(@RequestBody TraineeModel Trainee) throws TraineeException {
		Trainee = traineeService.addTrainee(Trainee);
		return new ResponseEntity<>(Trainee, HttpStatus.CREATED);
	}

	/*
	 * to modify aTrainee return :Trainee params : NIL
	 */
	@PutMapping
	public ResponseEntity<TraineeModel> updateTrainee(@RequestBody TraineeModel Trainee) throws TraineeException {
		Trainee = traineeService.updateTrainee(Trainee);
		return new ResponseEntity<>(Trainee, HttpStatus.OK);

	}

	/*
	 * to delete aTrainee return : void params :TraineeId
	 */
	@DeleteMapping("/{traineeid}")
	public ResponseEntity<Void> deleteTrainee(@PathVariable("traineeid") Long TraineeId) throws TraineeException {
		ResponseEntity<Void> response = null;
		TraineeModel Trainee = traineeService.viewTraineeById(TraineeId);
		if (Trainee == null) {
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);

		} else {
			traineeService.removeTrainee(TraineeId);
			response = new ResponseEntity<>(HttpStatus.OK);

		}
		return response;
	}
	/*
	 * to view aTrainee return : void params :TraineeId
	 */
	@GetMapping("/id/{traineeId}")
	public ResponseEntity<TraineeModel> viewTraineeById(@PathVariable("traineeId") Long TraineeId) throws TraineeException {
		return ResponseEntity.ok(traineeService.viewTraineeById(TraineeId));
		/*	ResponseEntity<TraineeModel> response = null;
		TraineeModel Trainee = traineeService.viewTraineeById(TraineeId);
		if (Trainee == null) {
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);

		} else {
			response = new ResponseEntity<>(HttpStatus.OK);

		}
		return response;*/
	}

	/*
	 * to retrieve aTrainee return :Trainee params name
	 */
	@GetMapping("/{name}")
	public ResponseEntity<TraineeModel> viewTraineeByName(@PathVariable("name") String name) throws TraineeException {
		ResponseEntity<TraineeModel> response = null;
		TraineeModel trainee = traineeService.viewTraineeByName(name);

		if (trainee == null) {
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);

		} else {
			response = ResponseEntity.ok(trainee);
		}
		return response;
	}

	/*
	 * to retrieve allTrainees return : List<Trainees> params : NIL
	 */
	@GetMapping
	public ResponseEntity<List<TraineeModel>> viewAllTrainees() throws TraineeException {
		return new ResponseEntity<>(traineeService.viewAllTrainees(), HttpStatus.OK);

	}

}
