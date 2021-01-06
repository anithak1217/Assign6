package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Product {

	
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int pid;
		private String pname;
		private double price;
		
		@JoinColumn(name="cid_fk")
		@ManyToOne
		private Customer customer;

		
		public Product() {
		}


		
		
		
		public Product(String pname, double price, Customer customer) {
			super();
			this.pname = pname;
			this.price = price;
			this.customer = customer;
		}





		public int getPid() {
			return pid;
		}


		public void setPid(int pid) {
			this.pid = pid;
		}


		public String getPname() {
			return pname;
		}


		public void setPname(String pname) {
			this.pname = pname;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public Customer getCustomer() {
			return customer;
		}


		public void setCustomer(Customer customer) {
			this.customer = customer;
		}





		public void add(Product p1) {
			// TODO Auto-generated method stub
			
		}
		
		
}
