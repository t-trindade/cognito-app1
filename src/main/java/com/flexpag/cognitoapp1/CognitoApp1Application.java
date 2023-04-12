package com.flexpag.cognitoapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity(prePostEnabled = true)
public class CognitoApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(CognitoApp1Application.class, args);
	}
}
