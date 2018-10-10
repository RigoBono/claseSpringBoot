package org.generation.apigeneration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan
@EnableWebMvc
@SpringBootApplication
public class ApiGenerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGenerationApplication.class, args);
	}
}
