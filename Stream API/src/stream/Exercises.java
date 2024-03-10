package stream;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {

	public static void main(String[] args) {
		// Given a list of integers, square each element in the list and collect the results into a new list.
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		List<Integer> squared = new ArrayList<>();
//		
//		squared = nums.stream()
//				.map(num -> num * num)
//				.collect(Collectors.toList());
//				
//		squared.stream().forEach(System.out::println);
		
		
		
		//Filter out odd numbers:
//		List<Integer> filtered = new ArrayList<>();
//		filtered = nums.stream()
//				.filter(num -> num % 2 == 0)
//				.collect(Collectors.toList());
//		filtered.stream().forEach(System.out::println);
		
		//calculate the sum of all the elements in the list
		
//		int sum = nums.stream()
//				.mapToInt(Integer::intValue)
//				.sum();
//		System.out.println("Sum " + sum);
//		
		
		//Find maximum element
//		Integer max = nums.stream()
//				.max(Integer::compareTo)
//				.orElse(Integer.MIN_VALUE);
//		System.out.println("Max: " + max);
//		
		
		//Count elems > 10
//		long count = nums.stream()
//				.filter(num -> num > 10)
//				.count();
//		System.out.println("Count of elements > 10: " + count);		
//		
		//toUpperCase
		List<String> words = Arrays.asList("HaRry", "John", "Taylor", "Shawn", "Paul");
		List<String> upped = words.stream()
				.map(word -> word.toUpperCase())
				.collect(Collectors.toList());
//		upped.stream().forEach(System.out::println);
		
		
//		List<String> filtered = words.stream()
//				.filter(word -> word.length() <= 5)
//				.collect(Collectors.toList());
//		filtered.stream().forEach(System.out::println);

		List<Double> doubles = Arrays.asList(2.4, 5.4, 5.6, 3.1, 2.8);
		double average = doubles.stream()
				.mapToDouble(Double::doubleValue)
				.average()
				.orElse(Double.NaN);
//		System.out.println("Average: " + average);
		
		String single = words.stream()
				.collect(Collectors.joining(", "));
		System.out.println("Concatendated: " + single);
		
		List<Boolean> palin = words.stream()
				.map(word -> isPalindrome(word))
				.collect(Collectors.toList());
		palin.stream().forEach(System.out::println);
		
		
		
	}
	static String reverse(String word) {
		String sb = new StringBuilder(word).reverse().toString();
		return sb;
	}
	static boolean isPalindrome(String str) {
		if(reverse(str).equals(str)) {
			return true;
		}
		return false;
	}
}
