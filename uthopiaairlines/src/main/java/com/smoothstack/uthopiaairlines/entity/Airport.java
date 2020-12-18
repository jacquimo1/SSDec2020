package com.smoothstack.uthopiaairlines.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "airports")
public class Airport {
	private String id;
	private String city;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
