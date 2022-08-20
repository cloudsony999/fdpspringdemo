package com.example;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
		Employee e = (Employee) ap.getBean("b1");
		List<String> ls = e.getKnownLanguages();
		for (String s : ls)
			System.out.println(s);
	}
}
