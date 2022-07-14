package com.test.pluto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="customer_record")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	
	public Customer() {
	}
	
	public Customer(int i, String n, String e) {
		super();
		id = i;
		name = n;
		email = e;
	}
	
	public Customer(String n, String e) {
		super();
		name = n;
		email = e;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int i) {
		this.id = i;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String e) {
		this.email = e;
	}
	
}