package com.bawono.tutorial.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bawono.tutorial.springdata.repository.PemainRepository;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataApplication.class, args);
		PemainRepository pemainrepository = context.getBean(PemainRepository.class);
		System.out.println(pemainrepository.findByNama("Sergio Ramos"));
	}
}
