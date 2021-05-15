package com.cg.trainee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.trainee.entity.TraineeEntity;

@Repository
public interface ITraineeRepository extends JpaRepository<TraineeEntity, Long>{

	TraineeEntity findBytraineename(String traineename);

}
