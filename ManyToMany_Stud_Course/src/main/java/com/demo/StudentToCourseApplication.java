package com.demo;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Course;
import com.demo.entities.Student;
import com.demo.repo.CourseRepo;
import com.demo.repo.StudentRepo;

@SpringBootApplication
public class StudentToCourseApplication implements CommandLineRunner{
	@Autowired 
	private StudentRepo  studentRepo ;
	@Autowired 
	private CourseRepo  courseRepo ;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentToCourseApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s1=new Student("Anitha");
		Student s2=new Student("Ram");
		Student s3=new Student("baby");
		Student s4=new Student("geetha");
		Student s5=new Student("eswer");
		Student s6=new Student("damu");
		
		Course c1=new Course("Java","Rajeev",LocalDate.of(2020, Month.JANUARY, 04));
		Course c2=new Course("spring boot","Rajeev",LocalDate.of(2020, Month.JANUARY, 04));
		Course c3=new Course("c","shobha",LocalDate.of(2020, Month.JANUARY, 05));
		Course c4=new Course("hibernate","shobha",LocalDate.of(2020, Month.JANUARY, 03));
		Course c5=new Course("MySql","kishore",LocalDate.of(2020, Month.JANUARY, 01));
		Course c6=new Course("PHP","Ram",LocalDate.of(2020, Month.JANUARY, 04));
		Course c7=new Course("HTML","Revathi",LocalDate.of(2020, Month.JANUARY, 05));
		Course c8=new Course("CSS","priya",LocalDate.of(2020, Month.JANUARY, 04));
		
		
		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		c1.getStudents().add(s3);
		
		c2.getStudents().add(s4);
		c2.getStudents().add(s5);
		
		c3.getStudents().add(s6);
		c4.getStudents().add(s1);
		c5.getStudents().add(s2);
		c6.getStudents().add(s4);
		c7.getStudents().add(s3);
		c8.getStudents().add(s6);
		
		
		s1.getCourses().add(c1);
		s1.getCourses().add(c2);
		
		s2.getCourses().add(c3);
		s2.getCourses().add(c4);
		
		s3.getCourses().add(c5);
		s3.getCourses().add(c6);
		
		s4.getCourses().add(c7);
		s5.getCourses().add(c8);
		s6.getCourses().add(c1);
		
		
		
		 
		 studentRepo.save(s1);
		 studentRepo.save(s2);
		 studentRepo.save(s3);
		 studentRepo.save(s4);
		 studentRepo.save(s5);
		 studentRepo.save(s6);
		 
		 courseRepo.save(c1);
		 courseRepo.save(c2);
		 courseRepo.save(c3);
		 courseRepo.save(c4);
		 courseRepo.save(c5);
		 courseRepo.save(c6);
		 courseRepo.save(c7);
		 courseRepo.save(c8);
		 
		
			
		
	}


}
