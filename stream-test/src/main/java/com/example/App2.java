package com.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating a stream from java array

		Stream<String> fra = Stream.of("c", "h", "k", "a", "p", "h");
		fra.forEach(System.out::println);

		System.out.println("---------------");

		String t1[] = { "abc", "pqr", "gty", "bgh" };
		Stream<String> fra2 = Arrays.stream(t1);
		fra2.forEach(System.out::println);
		System.out.println("--------------------");
		Stream<String> fra3 = Arrays.stream(t1, 0, 2);
		fra3.forEach(System.out::println);

	}

}
