
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

public class User {
	
	
    @Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int uid;
    private String ufirstname;
	private String ulastname;
	private String username;
	private String upassword;
	private String uconfirmpassword;
	private String uemail;
	private long uphonenumber;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUfirstname() {
		return ufirstname;
	}
	public void setUfirstname(String ufirstname) {
		this.ufirstname = ufirstname;
	}
	public String getUlastname() {
		return ulastname;
	}
	public void setUlastname(String ulastname) {
		this.ulastname = ulastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUconfirmpassword() {
		return uconfirmpassword;
	}
	public void setUconfirmpassword(String uconfirmpassword) {
		this.uconfirmpassword = uconfirmpassword;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public long getUphonenumber() {
		return uphonenumber;
	}
	public void setUphonenumber(long uphonenumber) {
		this.uphonenumber = uphonenumber;
	}


	
}