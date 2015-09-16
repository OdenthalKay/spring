package com.demo;

public class Person {
	private int id;
	private String name;
	private int taxId;
	private Address address;

	public Person(int id, String name, int taxId, Address address) {
		this.id = id;
		this.name = name;
		this.taxId = taxId;
		this.address = address;
	}

	public Person() {
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void speak() {
		System.out.println("hello world!");
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

	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

}
