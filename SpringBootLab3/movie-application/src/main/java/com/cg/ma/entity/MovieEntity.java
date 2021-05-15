package com.cg.ma.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class MovieEntity {

	@Id
	@Column(name = "movie_id", length = 19)
	private Long movieId;
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="movie_cat")
	private String category;
	
	@Column(name="movie_dur")
	private String duration;
	
	@Column(name="movie_ticket")
	private BigDecimal ticket;

	public MovieEntity(){
		//default 
	}
	
	
	
	public MovieEntity(Long movieId,String movieName, String category, String duration, BigDecimal ticket) {
		super();
		this.movieId=movieId;
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
		MovieEntity other = (MovieEntity) obj;
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
		return String.format("MovieEntity [movieId=%s, movieName=%s, category=%s, duration=%s, ticket=%s]", movieId,
				movieName, category, duration, ticket);
	}

	
	
	
	
}
