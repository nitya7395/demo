package com.app.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "permision")
public class Permision {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;

	  @Enumerated(EnumType.STRING)
	  @Column(length = 20)
	  private Param name;

	public Param getName() {
		return name;
	}

	public void setName(Param name) {
		this.name = name;
	}
	  
	  
}