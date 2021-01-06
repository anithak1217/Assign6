package com.demo;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Customer;
import com.demo.entities.Product;
import com.demo.entities.Review;
import com.demo.repo.CustomerRepo;
import com.demo.repo.ProductRepo;
import com.demo.repo.ReviewRepo;

@SpringBootApplication
public class MappingDemoApplication implements CommandLineRunner{

	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private ReviewRepo reviewRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(MappingDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args)throws Exception
	{
	//	Customer c1=new Customer("anitha","anithak1217@gmail.com" );
	//	Customer c2=new Customer("ram","ram@gmail.com" );
	//	Customer c3=new Customer("baby","babyy@gmail.com" );
		
		
	//	Product p1=new Product("mobile", 15000.00,c1);
	//	Product p2=new Product("tv", 25000.00,c1);
		
	//	Product p3=new Product("AC", 23000.00,c2);	
	//	Product p4=new Product("Cell Phone", 19000.00,c2);
		
	//	Product p5=new Product("Cooler", 32000.00,c3);
	//	Product p6=new Product("speakers", 5000.00,c3);
		
		//c1 employee products
	//		c1.getProducts().add(p1);
	//		c1.getProducts().add(p2);
		
		//c2 employee products
	//			c2.getProducts().add(p3);
	//			c2.getProducts().add(p4);
				
		//c3 employee products
	//			c3.getProducts().add(p5);
	//			c3.getProducts().add(p6);
				
			
	//	customerRepo.save(c1);
	//	customerRepo.save(c2);
	//	customerRepo.save(c3);
				
	//	productRepo.save(p1);
	//	productRepo.save(p2);
	//	productRepo.save(p3);
	//	productRepo.save(p4);
	//	productRepo.save(p5);
	//	productRepo.save(p6);
		
		
		
		
		
		
		
		
		
		
	//	Review r1=new Review((LocalDate.of(2021, Month.JANUARY, 04)), "abc", p1);
	//	Review r2=new Review((LocalDate.of(2021, Month.JANUARY, 04)), "abc", p3);
	//	Review r3=new Review((LocalDate.of(2021, Month.JANUARY, 04)), "abc", p2);
		
	//	r1.getProduct().add(p1);
	//	r2.getProduct().add(p1);
	//	r3.getProduct().add(p3);
		
	//	reviewRepo.save(r1);
	//	reviewRepo.save(r2);
	//	reviewRepo.save(r3);
		
		
	}
}
