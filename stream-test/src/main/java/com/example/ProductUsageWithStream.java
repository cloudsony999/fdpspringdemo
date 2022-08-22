package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.entity.Product;

public class ProductUsageWithStream {

	private static List<Product> productList = new ArrayList<>();

	public static void main(String[] args) {
		// adding products
		productList.add(new Product(1, "HP Laptop", 45000.45));
		productList.add(new Product(2, "DELL Laptop", 47000.45));
		productList.add(new Product(3, "ACER Laptop", 35000.45));
		productList.add(new Product(4, "APPLE Laptop", 85000.45));
		productList.add(new Product(5, "LENEVO Laptop", 49000.45));
		filtering();

	}

	private static void filtering() {

		List<Double> productPriceList = productList.stream().filter((product) -> product.getPrice() <= 49000.45)
				.map((product) -> product.getPrice()).collect(Collectors.toList());
		// display
		productPriceList.forEach((price) -> System.out.println(price));

	}

}
