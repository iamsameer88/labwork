package com.cg.trainee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Trainees")
public class TraineeEntity {

	@Id
	@Column(name = "trainee_id", length = 19)
	private Long traineeid;

	@Column(name = "trainee_name", length = 30)
	private String traineename;

	@Column(name = "trainee_domain", length = 50)
	private String traineedomain;

	@Column(name = "trainee_location", length = 30)
	private String traineelocation;

	public TraineeEntity() {
		// no implementation
	}

	public TraineeEntity(Long traineeid, String traineename, String traineedomain, String traineelocation) {
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
		TraineeEntity other = (TraineeEntity) obj;
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
		return "TraineeEntity [traineeid=" + traineeid + ", traineename=" + traineename + ", traineedomain="
				+ traineedomain + ", traineelocation=" + traineelocation + "]";
	}
}
