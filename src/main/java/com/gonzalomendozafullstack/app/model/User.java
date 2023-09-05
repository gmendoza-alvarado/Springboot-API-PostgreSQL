package com.gonzalomendozafullstack.app.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = -7288318443823668303L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//Id auto generation
	private int id;

	//@Column(name = "name_complete") change name original
	private String name;
	private String surName;
	private int age;
	private Boolean enabled;

	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;

	@ManyToOne
	@JoinColumn(name = "state_id")
	private State state;


	public User(int id, String name, String surName, int age, Boolean enabled, Country country, State state) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.age = age;
		this.enabled = enabled;
		this.country = country;
		this.state = state;
	}
	 public User() {}

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

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}
