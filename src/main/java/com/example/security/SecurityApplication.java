package com.example.security;

import com.example.security.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableWebSecurity
@EnableJpaRepositories
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Bean
	BCryptPasswordEncoder brBCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}


	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
//			userService.saveRole(new Role(null, "ROLE_USER"));
//			userService.saveRole(new Role(null, "ROLE_MANAGER"));
//			userService.saveRole(new Role(null, "ROLE_ADMIN"));
//			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//			userService.saveUser(new User(null, "HO Van TRUNG", "hvtrung", "hovantrung241298@gmail.com", "123456", new HashSet<>()));
//			userService.saveUser(new User(null, "HO Van Ta", "hvta", "hovanta@gmail.com", "12345", new HashSet<>()));
//
//			userService.addToUser("hovantrung241298@gmail.com", "ROLE_USER");
//			userService.addToUser("hovantrung241298@gmail.com", "ROLE_SUPER_ADMIN");
//
//			userService.addToUser("hovanta@gmail.com", "ROLE_USER");
//			userService.addToUser("hovanta@gmail.com", "ROLE_SUPER_ADMIN");

		};
	}
}
