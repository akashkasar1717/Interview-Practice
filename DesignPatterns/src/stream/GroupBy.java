package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupBy {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("John", "New York"), new Person("Jane", "London"),
				new Person("Jack", "New York"));
		Map<String, List<Person>> result = people.stream().collect(Collectors.groupingBy(Person::getCity));

		List<Entry<String, List<Person>>> obj = result.entrySet().stream().filter(s -> (s.getKey().length()) > 1)
				.collect(Collectors.toList());

		List<Stream<String>> namesList = obj.stream().map(a->a.getValue().stream().map(Person::getName)).collect(Collectors.toList());

		for (Stream<String> nameStream : namesList) {
		    nameStream.forEach(name -> System.out.println("Name: " + name));
		}
	}
}
