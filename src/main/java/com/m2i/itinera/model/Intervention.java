package com.m2i.itinera.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Intervention extends Entite {
	
	public Intervention() {	
	}
	
	@Column(
		name="description", 
		columnDefinition = "text",
		nullable = false
	)
	private String description;
	
	@Column(name="etat")
	private String etat;
	
	@Column(name="titre")
	private String titre;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
}
