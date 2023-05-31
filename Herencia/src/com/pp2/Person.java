package com.pp2;

public class Person {
	protected int age;
	protected String name;
	
	public Person() {
		
}
	
	public Person (int age, String name) {
	this.age = age;
	this.name = name;
}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	protected void showAge() {
		System.out.println("Age is " + age);
	}

}
