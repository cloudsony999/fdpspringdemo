package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// creating empty stream
		System.out.println("creating empty stream ");
		Stream<String> st = Stream.empty();
		st.forEach(System.out::println);// null
		System.out.println("----------------------");

		// how stream can be created?
		// from collection
		// convert array to list
		List<String> lst = Arrays.asList("amitava", "pallabi", "sayan", "dip", "tata", "sayni", "amitava");
		// convert list to stream
		Stream<String> st2 = lst.stream();
		st2.forEach(System.out::println);
		System.out.println("-------------------------------");

		Set<String> ss = new HashSet<>(lst);
		// convert set to stream
		Stream<String> st3 = ss.stream();
		st3.forEach(System.out::println);
		System.out.println("-------------------------");

	}
}
