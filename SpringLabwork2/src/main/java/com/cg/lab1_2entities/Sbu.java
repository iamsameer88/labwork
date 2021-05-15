package com.cg.lab1_2entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sbu {
	@Value("101")
	private int sbuId;
	@Value("Product Engineering Services")
	private String sbuName;
	@Value("Kiran Rao")
	private String sbuHead;

	public Sbu() {
		super();
		/*no implementation*/
	}

	public Sbu(int sbuId, String sbuName, String sbuHead) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}


	public int getSbuId() {
		return sbuId;
	}

	public void setSbuId(int sbuId) {
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
		return "Sbu [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}

}
