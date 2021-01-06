package com.demo.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rid;
	private LocalDate rDate;
	private String details;
	
	@JoinColumn(name="pid_fk")
	@ManyToOne
	private Product product;

	public Product getProduct() {
		return product;
	}

	public Review(LocalDate rDate, String details, Product product) {
		super();
		this.rDate = rDate;
		this.details = details;
		this.product = product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Review() {
	}

	public Review(LocalDate rDate) {
		this.rDate = rDate;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public LocalDate getrDate() {
		return rDate;
	}

	public void setrDate(LocalDate rDate) {
		this.rDate = rDate;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}


	
}
