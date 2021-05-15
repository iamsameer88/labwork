package com.cg.labassignment1_3entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sbu {

	@Value("PES BU")
	private String sbuId;
	@Value("Harrist")
	private String sbuName;
	@Value("Project engineering services")
	private String sbuHead;

	private List<Employee> list;

	public List<Employee> getList() {
		return list;
	}

	@Autowired
	public void setList(List<Employee> list) {
		this.list = list;
	}

	public Sbu() {
		super();
		/* no implementation */
	}

	public Sbu(String sbuId, String sbuName, String sbuHead, List<Employee> list) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.list = list;
	}

	public String getSbuId() {
		return sbuId;
	}

	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	@Override
	public String toString() {
		return "SBUBean [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
}