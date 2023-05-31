package com.pp2;

public class Student extends person {
	private String nameOfUniversity;
	
	public Student(int age, String name, String nameOfUniversity) {
		super(age, name);
		this.nameOfUniversity = nameOfUniversity;
	}
	
	public void showStudent() {
		System.out.println("Student name:" + name);
		System.out.println("Age:" + age);
		System.out.println("University:" + nameOfUniversity);
	}
	
	public void showAge() {
		super.showAge();
	}
}
