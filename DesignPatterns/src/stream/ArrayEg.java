package stream;

import java.util.Arrays;
import java.util.List;

public class ArrayEg {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		String[] result = words.stream().toArray(String[]::new);
		for (String arr : result) {
			System.out.println(arr);
		}
	}
}
