package com.cg.ma.api;

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

import com.cg.ma.exception.MovieException;
import com.cg.ma.model.MovieModel;
import com.cg.ma.service.IMovieService;


@RestController
@RequestMapping(path="/movie")
public class MovieRestContoller {
	
	/*
	 * Movie Service is Autowired 
     */
	
	@Autowired
	private IMovieService movieService;
	
	/*
	 * to add a Movie
	 * return : Movie
	 * params : NIL
	 */
	@PostMapping
	public ResponseEntity<MovieModel>addMovie(@RequestBody MovieModel Movie)throws MovieException{
		Movie=movieService.addMovie(Movie);
		return new ResponseEntity<>(Movie, HttpStatus.CREATED);
	}
	
	/*
	 * to modify a Movie
	 * return : Movie
	 * params : NIL
	 */
	@PutMapping
	public ResponseEntity<MovieModel> updateMovie(@RequestBody MovieModel Movie) throws MovieException {
		Movie = movieService.updateMovie(Movie);
		 return new ResponseEntity<>(Movie, HttpStatus.OK);
		
	}
	
	/*
	 * to delete a Movie
	 * return : void
	 * params : MovieId
	 */
	@DeleteMapping("/{movieId}")
	public ResponseEntity<Void> deleteMovie(@PathVariable("movieId") Long movieId) throws MovieException{
		ResponseEntity<Void> response = null;
		MovieModel movie = movieService.viewMovie(movieId);
		if (movie == null) {
			 response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		} else {
			movieService.removeMovie(movieId);
			response = new ResponseEntity<>(HttpStatus.OK);
			
		}
		return response;
	}
	
	/*
	 * to retrieve a Movie
	 * return : Movie
	 * params : MovieId
	 */
	@GetMapping("/{category}")
	public ResponseEntity<MovieModel> viewMovie(@PathVariable("category") String category) throws MovieException {
		ResponseEntity<MovieModel> response = null;
		MovieModel movie = movieService.viewMovieByCategory(category);
		
		if (movie == null) {
			 response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		} else {
			response = ResponseEntity.ok(movie);
		}
		return response;
	}
	/*
	 * to retrieve all Movies
	 * return : List<Movies>
	 * params : NIL
	 */
	@GetMapping
	public ResponseEntity<List<MovieModel>> viewAllMovies() throws MovieException {
		 return new ResponseEntity<>(movieService.viewAllMovies(), HttpStatus.OK);
		
	}
	
	
	
	
}