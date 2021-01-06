package com.demo;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Location;
import com.demo.entities.Post;
import com.demo.entities.User;
import com.demo.repo.LocationRepo;
import com.demo.repo.PostRepo;
import com.demo.repo.UserRepo;

@SpringBootApplication
public class PostTaskApplication  implements CommandLineRunner {
	
	
 @Autowired
 private UserRepo userRepo ;
 @Autowired
 private PostRepo postsRepo ;
 @Autowired
 private LocationRepo locationRepo ;
	

	public static void main(String[] args) {
		SpringApplication.run(PostTaskApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		Location l1=new Location("AP");
		Location l2=new Location("TN");
		
		Post p1=new Post("normal post",LocalDate.of(2021, Month.JANUARY, 5));
		Post p2=new Post("Register post",LocalDate.of(2020, Month.MARCH, 18));
		Post p3=new Post("speed post",LocalDate.of(2020, Month.JULY, 26));
		Post p4=new Post("courier",LocalDate.of(2020, Month.DECEMBER, 2));
		
		User u1=new User("Anitha","Reddy","anithak1217@gmail.com");
		User u2=new User("Ram","Koppala","r@gmail.com");
		User u3=new User("Chandra","Reddy","c@gmail.com");
		User u4=new User("Ani","Koppala","a@gmail.com");
		
		
		
		p1.getUsers().add(u1);
		p2.getUsers().add(u1);
		
		p3.getUsers().add(u2);
		p4.getUsers().add(u2);
		
		
		p1.getUsers().add(u3);
		p2.getUsers().add(u4);
		
		
		l1.getUsers().add(u1);
		l1.getUsers().add(u2);
		
		l2.getUsers().add(u3);
		l2.getUsers().add(u4);
		

		//u1.getLocation().add(l1);
		//u2.getLocation().add(l2);
		
		userRepo.save(u1);
		userRepo.save(u2);
		userRepo.save(u3);
		userRepo.save(u4);
		
		
		postsRepo.save(p1);
		postsRepo.save(p2);
		postsRepo.save(p3);
		postsRepo.save(p4);
		
		
		locationRepo.save(l1);
		locationRepo.save(l2);
		
		

		
		
		

}
}