package com.coforge.java8features;

import java.util.ArrayList;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8FeaturesFilterMapforEachLambdaExpApplication {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);

		System.out.println("original list: " + numbers);

		// filter method is used to filer even numbers from list using lambda expression

		List<Integer> filterNumbers = numbers.stream().filter(num -> num % 2 == 0).toList();

		System.out.println("Filter Numbers: " + filterNumbers);

		// Map method is used to square each number from the list using lambda expression

		List<Integer> mappedNumbers = numbers.stream().map(num -> num * num).toList();

		System.out.println("Mapped Numbers : " + mappedNumbers);

		// forEach method is used to print each number in the list using lambda expression

		numbers.forEach(num -> System.out.println("Number :" + num));

	}

}
