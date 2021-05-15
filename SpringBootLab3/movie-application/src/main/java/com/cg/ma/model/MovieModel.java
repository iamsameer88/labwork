package com.cg.ma.model;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class MovieModel {
	
	@NotNull(message="movieId cannot be null")
	@NotEmpty(message="movieId cannot be empty")
	private Long movieId;
	
	@NotNull(message="movieName cannot be null")
	@NotEmpty(message="movieName cannot be empty")
	private String movieName;
	
	@NotNull(message="category cannot be null")
	@NotEmpty(message="category cannot be empty")
	private String category;
	
	@NotNull(message="duration cannot be null")
	@NotEmpty(message="duration cannot be empty")
	private String duration;
	
	@Min(value = 100,message = "ticket price should be more than 100")
	@NotEmpty(message="ticket cannot be empty")
	private BigDecimal ticket;

	public MovieModel() {
		//default
	}

	public MovieModel(
			@NotNull(message = "movieId cannot be null") @NotEmpty(message = "movieId cannot be empty") Long movieId,
			@NotNull(message = "movieName cannot be null") @NotEmpty(message = "movieName cannot be empty") String movieName,
			@NotNull(message = "category cannot be null") @NotEmpty(message = "category cannot be empty") String category,
			@NotNull(message = "duration cannot be null") @NotEmpty(message = "duration cannot be empty") String duration,
			@Min(value = 100, message = "ticket price should be more than 100") @NotEmpty(message = "ticket cannot be empty") BigDecimal ticket) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.category = category;
		this.duration = duration;
		this.ticket = ticket;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public BigDecimal getTicket() {
		return ticket;
	}

	public void setTicket(BigDecimal ticket) {
		this.ticket = ticket;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((movieId == null) ? 0 : movieId.hashCode());
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + ((ticket == null) ? 0 : ticket.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieModel other = (MovieModel) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (movieId == null) {
			if (other.movieId != null)
				return false;
		} else if (!movieId.equals(other.movieId))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (ticket == null) {
			if (other.ticket != null)
				return false;
		} else if (!ticket.equals(other.ticket))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("MovieModel [movieId=%s, movieName=%s, category=%s, duration=%s, ticket=%s]", movieId,
				movieName, category, duration, ticket);
	}
	
	
	
	
}
