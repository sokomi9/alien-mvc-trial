package com.abiud.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AbiudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AbiudApplication.class, args);
		
		Alien a = context.getBean(Alien.class);
		a.show();
	}

}
