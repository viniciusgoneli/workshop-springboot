package com.vallosstudio.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vallosstudio.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
