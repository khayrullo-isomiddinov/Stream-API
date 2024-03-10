package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Warren Buffet", 120));
		people.add(new Person("Jeff Bezos", 150));
		people.add(new Person("Bill Gates", 100));
		people.add(new Person("Mark Zuckerberg", 50));
		people.add(new Person("Khayrullo Isomiddinov", 0));
		
		//sorts the names alphabetically
//		List<Person> sortedList = people.stream()
//				.sorted(Comparator.comparing(person -> person.name))
//				.collect(Collectors.toList());
//		sortedList.forEach(person -> System.out.println(person));
//		
		//filters out the billioners under 100 blns
		List<Person> hundredSortedClub = people.stream()
			.filter(person -> person.billions >= 100) // leaves only those who have MORE than 100 billion
			.sorted(Comparator.comparing(person -> person.name)) // sorts the names alphabetically
			.collect(Collectors.toList());
		
		hundredSortedClub.forEach(person -> System.out.println(person));
	}
}


