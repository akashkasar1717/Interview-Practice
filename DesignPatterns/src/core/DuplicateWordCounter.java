package core;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordCounter {
	public static void main(String[] args) {
		String input = "Java is great and Java is fun. Programming in Java is great.";
		String normalizedInput = input.toLowerCase();
		String[] words = normalizedInput.split("\\W+");
		Map<String, Integer> wordCountMap = new HashMap<>();
		for (String word : words) {
			if (wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word) + 1);
			} else {
				wordCountMap.put(word, 1);
			}
		}

		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}
}
