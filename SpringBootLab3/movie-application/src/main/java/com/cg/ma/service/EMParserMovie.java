package com.cg.ma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ma.entity.MovieEntity;
import com.cg.ma.model.MovieModel;
import com.cg.ma.repository.IMovieRepository;

@Service
public class EMParserMovie {
	
	@Autowired
	private IMovieRepository movieRepo;
	
	public EMParserMovie(){
		
	}


	public EMParserMovie(IMovieRepository movieRepo) {
		super();
		this.movieRepo = movieRepo;
	}




	public MovieModel parse(MovieEntity source) {
		return source==null ? null:
			new MovieModel(source.getMovieId(),source.getMovieName(),source.getCategory(),source.getDuration(),source.getTicket());
	}
	
	/*
	 * Method to parse Model to Entity
     */
	
	public MovieEntity parse(MovieModel source) {
		return source==null ? null:
			new MovieEntity(source.getMovieId(),source.getMovieName(),source.getCategory(),source.getDuration(),source.getTicket());
	}

}
