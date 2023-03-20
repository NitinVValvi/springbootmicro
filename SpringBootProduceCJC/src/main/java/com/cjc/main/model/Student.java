package com.cjc.main.model;


public class Student {
	
	private int id;
	private String name;
	private String username;
	private String password;
	private String addr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Student(int id, String name, String username, String password, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.addr = addr;
	} 
	
}
