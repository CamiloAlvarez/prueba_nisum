package com.nisum.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.nisum.prueba.model.*")
@ComponentScan(basePackages = { "com.nisum.prueba.*" })
@EntityScan("com.nisum.prueba.model.*") 
public class SpringBootNisumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNisumApplication.class, args);
	}
}