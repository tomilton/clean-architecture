package co.com.lineadirecta.servicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com" })
public class DespachoServiciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DespachoServiciosApplication.class, args);
	}

}
