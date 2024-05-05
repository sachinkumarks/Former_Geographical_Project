package com.project.formerG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FormerGApplication implements Runnable{
	public void run() {
		System.out.println("FormerG__Application_Started");
	}

	public static void main(String[] args) {
		SpringApplication.run(FormerGApplication.class, args);
	}

}

