package com.cg.ma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ma.entity.MovieEntity;

@Repository
public interface IMovieRepository extends JpaRepository<MovieEntity, Long>{
	
	MovieEntity findByCategory(String category);

}
