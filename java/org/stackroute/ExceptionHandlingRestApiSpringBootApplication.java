package org.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.stackroute")
public class ExceptionHandlingRestApiSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionHandlingRestApiSpringBootApplication.class, args);
	}

}
