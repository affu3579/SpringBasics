package com.JPAproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.JPAproject.Repo.StudentRepo;
import com.JPAproject.entity.StudentEntity;

@SpringBootApplication
public class SampleJpAprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SampleJpAprojectApplication.class, args);
	   StudentRepo	obj =context.getBean(StudentRepo.class);
	   
	   StudentEntity s=new StudentEntity();
	   s.setBranch("HYD");
	   s.setName("affan");
	 StudentEntity s1= obj.save(s);
	 System.out.println(s1);
		
	}

}
