package com.vallosstudio.workshop.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vallosstudio.workshop.entities.User;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User u1 = new User(null, "João da Silva", "joao@gmail.com", "1588442255", "2122545");
		User u2 = new User(null, "Mariana Luz", "mariana@gmail.com", "1587889963", "2556512");
		return ResponseEntity.ok().body(Arrays.asList(u1, u2));
	}
}
