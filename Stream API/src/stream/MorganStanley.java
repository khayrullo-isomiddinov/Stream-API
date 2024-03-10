package stream;

import java.util.stream.Stream;
	
public class MorganStanley {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Morgan", "Stanley", "Investment", "Management");
		stream.filter(
			str -> "AEIOU".indexOf(Character.toUpperCase(str.charAt(1))) != -1)
			.forEach(System.out::println);
	}
}
