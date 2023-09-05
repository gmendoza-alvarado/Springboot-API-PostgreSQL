package com.gonzalomendozafullstack.app.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "state")

public class State implements Serializable {

	private static final long serialVersionUID = -7288318443823668303L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//Id auto generation
	private int id;

	private String name;
	private Country country;


	public State() {}
	
	public State(String name, Country country) {
		super();
		this.name = name;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
}
