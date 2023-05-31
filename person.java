package com.pp2;

public class person {
	protected int age;
	protected String name;
	
	public person() {
		
	}
	
	public person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	protected void showAge() {
		System.out.println("Age is " + age);
	}
}
