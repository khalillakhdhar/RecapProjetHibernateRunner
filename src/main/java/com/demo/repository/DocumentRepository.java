package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Integer> {

}
