package com.m2i.itinera.jpa;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.itinera.model.Intervention;

//Allow to use simple methods to manage model with database
//For example, we can use .findAll() from this repository
public interface RepoIntervention extends JpaRepository<Intervention, Serializable> {
	
}
