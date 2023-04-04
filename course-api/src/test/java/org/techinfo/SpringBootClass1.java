package org.techinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootClass1 {
	public static void main(String[] args) {
		//step-1 give first argument-same as class-name
		SpringApplication.run(SpringBootClass1.class, args);
		
	}

}
