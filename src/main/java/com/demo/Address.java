package com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="ADDRESS")
public class Address {
	@Id
	private int id;
	@Column(name="PLZ")
	private String plz;

	public Address() {
	}

	public Address(int id, String plz) {
		this.id = id;
		this.plz = plz;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", plz=" + plz + "]";
	}

}
