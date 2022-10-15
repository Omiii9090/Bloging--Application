package com.cdac.blogapp;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import com.cdac.blogapp.repositories.UserRepo;

@SpringBootTest
public class BlogAppApisApplicationTestsTests {
	@Autowired
	private UserRepo userRepo;
	@Test
	void contextLoads() {
		
	}
	
	@Test
	public void RepoTest() {
		
	}
	
}