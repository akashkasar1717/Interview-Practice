package core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

 public class LongestSubstring {
	public static void main(String[] args) {
		String input = "abcabcbbabcdbbbbbbbabcdefg";
		String subStr = "";
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < input.length(); j++) {
				if (j != input.length() - 1 && i != j + 1 && i < j) {
					if (input.charAt(i) == input.charAt(j + 1)) {
						subStr = input.substring(i, j + 1);
						list.add(subStr);
						break;
					}
				}
			}
		}
		System.out.println(list);
		Optional<String> list1 = list.stream().max(Comparator.comparingInt(String::length));
		System.out.println(list1);
	}
}
