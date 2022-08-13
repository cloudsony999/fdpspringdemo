package com.example;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Student s1 = new Student();
		s1.setId(100);
		s1.setName("amitava");
		System.out.println(s1);
		System.out.println("-------------");
		Student s2 = new Student(200, "amit");
		System.out.println(s2);
		System.out.println("-----------------Spring Framework------------");

	}
}
