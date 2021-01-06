package com.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String cname;
	private String email;
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Product> products=new ArrayList<>();
	
	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	public Customer() {
		
	}


	public Customer(int cid, String cname, String email) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
	}


	public Customer(String cname, String email) {
		super();
		this.cname = cname;
		this.email = email;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
