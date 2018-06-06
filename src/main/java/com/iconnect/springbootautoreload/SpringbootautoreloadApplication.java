package com.iconnect.springbootautoreload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true)
public class SpringbootautoreloadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootautoreloadApplication.class, args);
	}
}
