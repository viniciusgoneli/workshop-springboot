package com.vallosstudio.workshop.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vallosstudio.workshop.entities.User;
import com.vallosstudio.workshop.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "João da Silva", "joao@gmail.com", "1588442255", "2122545");
		User u2 = new User(null, "Mariana Luz", "mariana@gmail.com", "1587889963", "2556512");
	
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
