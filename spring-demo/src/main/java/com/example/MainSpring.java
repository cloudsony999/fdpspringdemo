package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
//		System.out.println(ap);
//		Student ss = (Student) ap.getBean("x");
//		System.out.println(ss.getId() + "  " + ss.getName());
//		Student ss2 = (Student) ap.getBean("x");
//		System.out.println(ss == ss2);

		Student ss = (Student) ap.getBean("y");
		System.out.println(ss.getId() + "  " + ss.getName());

		Person pp1 = (Person) ap.getBean("p1");
		System.out.println(pp1.getName());
		pp1.driveCar();

		Person pp2 = (Person) ap.getBean("p2");
		System.out.println(pp2.getName());
		pp2.driveCar();

		System.out.println("--------------spring jdbc---------------");
		SCreate sc = (SCreate) ap.getBean("sc");
		sc.createMyTable();

	}

}
