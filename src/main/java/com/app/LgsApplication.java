package com.app;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LgsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LgsApplication.class, args);
	}
	
	@Bean 
	public ModelMapper mapper()
	{
		System.out.println("in mapper");
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
