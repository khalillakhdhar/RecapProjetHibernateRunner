package com.demo.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Message implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titre;
	private String texte;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Message(int id, String titre, String texte, User user) {
		
		this.id = id;
		this.titre = titre;
		this.texte = texte;
		this.user = user;
	}
	public Message() {
		
	}
	public Message(String titre, String texte, User user) {
		
		this.titre = titre;
		this.texte = texte;
		this.user = user;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", titre=" + titre + ", texte=" + texte + ", user=" + user + "]";
	}
	
	
	
	
	

}
