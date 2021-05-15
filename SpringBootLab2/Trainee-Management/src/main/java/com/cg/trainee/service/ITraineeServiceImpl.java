package com.cg.trainee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trainee.entity.TraineeEntity;
import com.cg.trainee.exception.TraineeException;
import com.cg.trainee.model.TraineeModel;
import com.cg.trainee.repo.ITraineeRepository;

@Service
public class ITraineeServiceImpl implements ITraineeService {
	public static final String NOT_FOUND = "no Trainee with id # ";
	public static final String PRESENT = " present";
	/*
	 * injecting repository
	 */
	@Autowired
	private ITraineeRepository itraineerepo;

	/*
	 * injecting EMParser
	 */
	@Autowired
	private EMParserTrainee parser;

	/*
	 * default constructor
	 */
	public ITraineeServiceImpl() {
		// default
	}

	/*
	 * parameter constructor
	 */
	public ITraineeServiceImpl(ITraineeRepository itraineerepo) {
		super();
		this.itraineerepo = itraineerepo;
		this.parser = new EMParserTrainee();
	}
	/*
	 * add trainees in data base
	 */

	@Override
	public TraineeModel addTrainee(TraineeModel Trainee) throws TraineeException {
		if (Trainee != null) {
			if (itraineerepo.existsById(Trainee.getTraineeid())) {
				throw new TraineeException("movie with this id already exists");
			} else {
				Trainee = parser.parse(itraineerepo.save(parser.parse(Trainee)));
			}
		}
		return Trainee;
	}

	/*
	 * update trainee data in database
	 */
	@Override
	public TraineeModel updateTrainee(TraineeModel Trainee) throws TraineeException {
		if (Trainee != null) {
			if (!itraineerepo.existsById(Trainee.getTraineeid())) {
				throw new TraineeException("movie with this id already exists");
			} else {
				Trainee = parser.parse(itraineerepo.save(parser.parse(Trainee)));
			}
		}
		return Trainee;

	}
	/*
	 * deleting trainee data by id
	 */

	@Override
	public boolean removeTrainee(Long TraineeId) throws TraineeException {
		TraineeEntity trainee = itraineerepo.findById(TraineeId).orElse(null);
		if (trainee == null) {
			throw new TraineeException(NOT_FOUND + TraineeId + PRESENT);
		} else {
			itraineerepo.deleteById(TraineeId);
			return true;
		}

	}
	/*
	 * view trainee data by trainee name
	 */

	@Override
	public TraineeModel viewTraineeByName(String Name) throws TraineeException {
		TraineeEntity trainee = itraineerepo.findBytraineename(Name);
		if (trainee == null) {
			throw new TraineeException("no trainee with name " + Name + PRESENT);
		} else {
			return parser.parse(itraineerepo.findById(trainee.getTraineeid()).orElse(null));
		}
	}

	/*
	 * view trainee by id
	 */
	@Override
	public TraineeModel viewTraineeById(Long TraineeId) throws TraineeException {
		TraineeEntity trainee = itraineerepo.findById(TraineeId).orElse(null);
		if (trainee == null) {
			throw new TraineeException("no trainee with id # " + TraineeId + PRESENT);
		}
		return parser.parse(itraineerepo.findById(TraineeId).get());

	}

	/*
	 * list of trainees from database
	 */
	@Override
	public List<TraineeModel> viewAllTrainees() throws TraineeException {
		return itraineerepo.findAll().stream().map(parser::parse).collect(Collectors.toList());

	}

}
