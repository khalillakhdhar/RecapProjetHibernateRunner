package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
