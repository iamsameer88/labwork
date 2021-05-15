package com.cg.trainee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.trainee.entity.TraineeEntity;
import com.cg.trainee.model.TraineeModel;
import com.cg.trainee.repo.ITraineeRepository;

@Service
public class EMParserTrainee {

	@Autowired
	private ITraineeRepository itraineerepo;

	public EMParserTrainee() {
		// default
	}

	public EMParserTrainee(ITraineeRepository itraineerepo) {
		super();
		this.itraineerepo = itraineerepo;
	}

	/*
	 * entity to model
	 */
	public TraineeModel parse(TraineeEntity source) {
		return source == null ? null
				: new TraineeModel(source.getTraineeid(), source.getTraineename(), source.getTraineedomain(),
						source.getTraineelocation());
	}

	/*
	 * model to entity
	 */
	public TraineeEntity parse(TraineeModel source) {
		return source == null ? null
				: new TraineeEntity(source.getTraineeid(), source.getTraineename(), source.getTraineedomain(),
						source.getTraineelocation());
	}
}
