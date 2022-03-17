package com.demo.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true, nullable = false)
	private String email;
	@Column(nullable = false)
	private String grade;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false)
	private String prenom;
	
	@OneToMany(mappedBy = "user")
	private Set<Message> message;
	@OneToMany(mappedBy = "user")
	private Set<Document> document;
	
	
	public Set<Message> getMessage() {
		return message;
	}
	public void setMessage(Set<Message> message) {
		this.message = message;
	}
	public Set<Document> getDocument() {
		return document;
	}
	public void setDocument(Set<Document> document) {
		this.document = document;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public User() {
	}
	public User(int id, String email, String grade, String password, String nom, String prenom) {
		
		this.id = id;
		this.email = email;
		this.grade = grade;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
	}
	public User(String email, String grade, String password, String nom, String prenom) {
		
		this.email = email;
		this.grade = grade;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", grade=" + grade + ", password=" + password + ", nom=" + nom
				+ ", prenom=" + prenom + "]";
	}
	
	
	
	
	

}
