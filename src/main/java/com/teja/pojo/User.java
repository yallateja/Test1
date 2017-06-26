package com.teja.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class User {

		
	private int id;
	
	
	private String name;
	public int getId() {
		return id;
	}
	@Autowired
	public void setId(@Value("${user.id}") int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(@Value("${user.fun}") String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}
