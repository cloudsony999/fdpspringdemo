package com.example;

public class Student {
	private int id;
	private String name;
	static {
		System.out.println("I am static block....");
	}

	public Student() {
		super();
		System.out.println("0 arg cons....");
	}

	public Student(int id, String name) {
		super();
		System.out.println("2 arg cons....");
		this.id = id;
		this.name = name;
	}

	public int getId() {
		System.out.println("getter....");
		return id;
	}

	public void setId(int id) {
		System.out.println("setter....");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
