package com.despacho.servicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.despacho.*"})
@EntityScan(basePackages = {"com.despacho.*"})
@EnableJpaRepositories(basePackages = {"com.despacho.*"})
public class DespachoServiciosApplication {


	public static void main(String[] args) {
		SpringApplication.run(DespachoServiciosApplication.class, args);
	}

}
