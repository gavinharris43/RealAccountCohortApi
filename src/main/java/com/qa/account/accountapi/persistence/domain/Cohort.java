package com.qa.account.accountapi.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cohort {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	public Cohort() {
		
	}
	
	public Cohort(String name) {
		this.name = name;
		
	}
	


	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
