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
public class Document implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	private String url;
	private String titre;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id_user", referencedColumnName = "id")
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Document() {
		super();
	}
	public Document(String description, String url, String titre, User user) {
		super();
		this.description = description;
		this.url = url;
		this.titre = titre;
		this.user = user;
	}
	public Document(int id, String description, String url, String titre, User user) {
		super();
		this.id = id;
		this.description = description;
		this.url = url;
		this.titre = titre;
		this.user = user;
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", description=" + description + ", url=" + url + ", titre=" + titre + ", user="
				+ user + "]";
	}
	
	

}
