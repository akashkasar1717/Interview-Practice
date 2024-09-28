package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ShortCircuit {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(-1, 2, 3, 4, 5);
		boolean result = numbers.stream().allMatch(n -> n > 0);
		System.out.println(result);
		
		List<Integer> numbers1 = Arrays.asList(5, 8, 12, 3);
		boolean result1 = numbers1.stream().anyMatch(n -> n > 10);
		System.out.println(result1);
		
		List<Integer> numbers2 = Arrays.asList(5, 8, 12, 3);
		boolean result2 = numbers2.stream().noneMatch(n -> n < 0);
		System.out.println(result2);
		
		
		
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		Optional<String> result3 = words.stream().filter(word -> word.startsWith("b"))
		                               .findFirst();
		System.out.println(result3);
		
		List<String> words1 = Arrays.asList("apple", "banana", "cherry");
		Optional<String> result4= words1.stream()
		                               .filter(word -> word.startsWith("c"))
		                               .findAny();
		System.out.println(result4);
	}
}
