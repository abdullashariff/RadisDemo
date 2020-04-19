package com.demo.radis.dto;

import java.io.Serializable;

public class Employees implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3376333616114043766L;
	private Long id;
	private String name;
	
	public Employees(){
		
	}
	
	public Employees(long id, String name){
		this.id = id;
		this.name = name;		
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
