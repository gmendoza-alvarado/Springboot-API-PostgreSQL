package com.gonzalomendozafullstack.app.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country implements Serializable {

	private static final long serialVersionUID = -7288318443823668303L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//Id auto generation
	private int id;


	public Country() {}
	
	public Country(String name) {
		super();
		this.name = name;
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


	private String name;

}
