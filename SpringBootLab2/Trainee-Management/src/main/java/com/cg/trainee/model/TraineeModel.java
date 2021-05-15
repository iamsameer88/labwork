package com.cg.trainee.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TraineeModel {

	@NotNull(message = "traineeId cannot be null")
	@NotEmpty(message = "traineeId cannot be empty")
	private Long traineeid;

	@NotNull(message = "trainee Name cannot be null")
	@NotEmpty(message = "trainee Name cannot be empty")
	private String traineename;

	@NotNull(message = "trainee domain cannot be null")
	@NotEmpty(message = "trainee domain cannot be empty")
	private String traineedomain;

	@NotNull(message = "trainee location cannot be null")
	@NotEmpty(message = "trainee location cannot be empty")
	private String traineelocation;

	public TraineeModel() {
		// no implementation
	}

	public TraineeModel(
			@NotNull(message = "traineeId cannot be null") @NotEmpty(message = "traineeId cannot be empty") Long traineeid,
			@NotNull(message = "trainee Name cannot be null") @NotEmpty(message = "trainee Name cannot be empty") String traineename,
			@NotNull(message = "trainee domain cannot be null") @NotEmpty(message = "trainee domain cannot be empty") String traineedomain,
			@NotNull(message = "trainee location cannot be null") @NotEmpty(message = "trainee location cannot be empty") String traineelocation) {
		super();
		this.traineeid = traineeid;
		this.traineename = traineename;
		this.traineedomain = traineedomain;
		this.traineelocation = traineelocation;
	}

	public Long getTraineeid() {
		return traineeid;
	}

	public void setTraineeid(Long traineeid) {
		this.traineeid = traineeid;
	}

	public String getTraineename() {
		return traineename;
	}

	public void setTraineename(String traineename) {
		this.traineename = traineename;
	}

	public String getTraineedomain() {
		return traineedomain;
	}

	public void setTraineedomain(String traineedomain) {
		this.traineedomain = traineedomain;
	}

	public String getTraineelocation() {
		return traineelocation;
	}

	public void setTraineelocation(String traineelocation) {
		this.traineelocation = traineelocation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((traineedomain == null) ? 0 : traineedomain.hashCode());
		result = prime * result + ((traineeid == null) ? 0 : traineeid.hashCode());
		result = prime * result + ((traineelocation == null) ? 0 : traineelocation.hashCode());
		result = prime * result + ((traineename == null) ? 0 : traineename.hashCode());
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
		TraineeModel other = (TraineeModel) obj;
		if (traineedomain == null) {
			if (other.traineedomain != null)
				return false;
		} else if (!traineedomain.equals(other.traineedomain))
			return false;
		if (traineeid == null) {
			if (other.traineeid != null)
				return false;
		} else if (!traineeid.equals(other.traineeid))
			return false;
		if (traineelocation == null) {
			if (other.traineelocation != null)
				return false;
		} else if (!traineelocation.equals(other.traineelocation))
			return false;
		if (traineename == null) {
			if (other.traineename != null)
				return false;
		} else if (!traineename.equals(other.traineename))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TraineeModel [traineeid=" + traineeid + ", traineename=" + traineename + ", traineedomain="
				+ traineedomain + ", traineelocation=" + traineelocation + "]";
	}

}
