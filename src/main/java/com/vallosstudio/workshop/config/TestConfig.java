package com.vallosstudio.workshop.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vallosstudio.workshop.entities.Order;
import com.vallosstudio.workshop.entities.User;
import com.vallosstudio.workshop.enums.OrderStatus;
import com.vallosstudio.workshop.repositories.OrderRepository;
import com.vallosstudio.workshop.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "João da Silva", "joao@gmail.com", "1588442255", "2122545");
		User u2 = new User(null, "Mariana Luz", "mariana@gmail.com", "1587889963", "2556512");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1, OrderStatus.WAITING_PAYMENT);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.PAID);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.SHIPPED); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
