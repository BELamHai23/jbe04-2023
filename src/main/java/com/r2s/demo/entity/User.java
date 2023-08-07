package com.r2s.demo.entity;

public class User {
	private long id;
	private String name;
	private int age;
	
	public User(long id,String name, int age) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
		
}
