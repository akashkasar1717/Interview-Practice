package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 9);
		Optional<Integer> max = numbers.stream().max(Integer::compareTo);

		Optional<Integer> min = numbers.stream().min(Integer::compareTo);

		System.out.println(min+" "+max);
	}
}
