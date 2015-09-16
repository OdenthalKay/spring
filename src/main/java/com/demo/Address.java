package com.demo;

public class Address {
	private int id;
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
