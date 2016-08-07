package com.kaushik.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table
@Component

public class Supplier {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int sid;
	private String sname;
	private String saddress;
	private double sphno;
	private String semail;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public double getSphno() {
		return sphno;
	}
	public void setSphno(double sphno) {
		this.sphno = sphno;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}

}
