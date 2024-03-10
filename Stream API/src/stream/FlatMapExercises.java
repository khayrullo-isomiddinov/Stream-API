package stream;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;


public class FlatMapExercises {

	public static void main(String[] args) {
		//turning the words of the stream into letters:
		List<String> words = Arrays.asList("Hello", "World");
		List<String> letters = words.stream()
				.flatMap(word -> Arrays.stream(word.split("")))
				.collect(Collectors.toList());
//		System.out.println(letters);
		
		//flattening a list of lists
		List<List<Integer>> listOfLists = Arrays.asList(
			Arrays.asList(1, 2, 3),
			Arrays.asList(4, 5, 6),
			Arrays.asList(0, 8, 7)
		);
		
		List<Integer> flattenedList = listOfLists.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
//		System.out.println(flattenedList);
		
		
		
	}
	
}
