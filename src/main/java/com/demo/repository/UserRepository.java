package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	// méthodes dérivé
List<User> findByNom(String nom); // List<Objet> FindBy{Attribut} => SELECT from WHERE
List<User> findByEmailAndPassword(String email,String password );
List<User> findByGradeIsNot(String grade); //  
}
