package com.h3.eiims.executives;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Executive {
	
	@Column(name="Id")
	@javax.persistence.Id
	private Integer Id;
	
	private String title;
	private String firstName;
	private String lastName;
	
	public Executive() {

	}
	
	public Executive(int id, String title, String firstName, String lastName) {
		super();
		Id = id;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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

}
