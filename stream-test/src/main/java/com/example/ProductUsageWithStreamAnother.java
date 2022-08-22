package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Product;

public class ProductUsageWithStreamAnother {

	private static List<Product> productList = new ArrayList<>();

	public static void main(String[] args) {
		// adding products
		productList.add(new Product(1, "HP Laptop", 45000.45));
		productList.add(new Product(2, "DELL Laptop", 47000.45));
		productList.add(new Product(3, "ACER Laptop", 35000.45));
		productList.add(new Product(4, "APPLE Laptop", 85000.45));
		productList.add(new Product(5, "LENEVO Laptop", 49000.45));
		productList.add(new Product(6, "NOKIA Laptop", 45000.45));
		productList.stream().filter((x) -> x.getPrice() == 45000.45)
				.forEach((a) -> System.out.println(a.getName() + " " + a.getPrice()));
		System.out.println("------------------");
		Product a = productList.stream().max((x, y) -> x.getPrice() > y.getPrice() ? 1 : -1).get();
		System.out.println(a);

		System.out.println("------------------");
		Product b = productList.stream().min((x, y) -> x.getPrice() > y.getPrice() ? 1 : -1).get();
		System.out.println(b);

	}

}
