package org.rakesh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "login")
public class User {
	
	@Id
	@Column (name = "id")
	private int id;
	@Column (name = "user_name")
	private String userName;
	@Column (name = "first_name")
	private String firstName;
	@Column (name = "last_name")
	private String lastName;
	@Column (name = "email")
	private String email;
	@Column (name = "password")
	private String password;
	
		
	
	public User() {
		
	}
	public User(String userName, String firstName, String lastName, String email, String password) {
		
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", password=" + password + "]";
	}
	
	

}
