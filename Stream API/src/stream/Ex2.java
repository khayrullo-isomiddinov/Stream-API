package stream;

import java.util.Scanner;
import java.util.List;
import java.util.OptionalDouble;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

public class Ex2 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Please enter a list of integers: ");
		String input = sc.nextLine();
		
		List<Integer> numbers = parseInput(input);
		
		List<Integer> oddOnes = numbers.stream()
				.filter(num -> num % 2 != 0)
				.map(num -> num * num)
				.collect(Collectors.toList());
		
		oddOnes.stream().forEach(System.out::println);
		*/
		/*
		System.out.println("Enter a list of strings separated by space");
		String input = sc.nextLine();
		
		List<String> strings = parseString(input);
		
		List<String> sortedStrings = strings.stream()
				.sorted()
				.collect(Collectors.toList());
//		sortedStrings.stream().forEach(System.out::println);
		*/
		// sumandaverage
		List<Double> doubles = Arrays.asList(2.3, 1.2, 3.2, 5.4, 6.7, 9.0, 9.8, 8.7, 8.9);
		
		double theSum = 0;
		theSum = doubles.stream()
				.mapToDouble(Double::doubleValue)
				.sum();
		System.out.println(theSum);
		
		OptionalDouble theAverage = doubles.stream()
				.mapToDouble(Double::doubleValue)
				.average();
		System.out.println(theAverage);
		
	}
	/*
	public static List<Integer> parseInput(String input) {
		String[] parts = input.split("\\s+");
		List<Integer> numbers = new ArrayList<>();
		
		for(String part : parts) {
			try {
				int num = Integer.parseInt(part);
				numbers.add(num);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input detected");
			}
		}
		return numbers;
	}
	*/
	public static List<String> parseString(String input) {
		String[] words = input.split("\\s+");
		List<String> strings = new ArrayList<>();
		
		for(String word : words) {
			strings.add(word);
		}
		return strings;
	}
}
