package com.security.project.Login;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	private int Id;
	private String username;
	private String password;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUseranme() {
		return username;
	}
	public void setUseranme(String useranme) {
		this.username = useranme;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
