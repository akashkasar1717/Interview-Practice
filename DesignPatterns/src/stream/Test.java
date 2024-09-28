package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 1, 8, 3, 9);

		Optional<Integer> as = numbers.stream().max(Integer::compareTo);

		System.out.println(as);

	}

}
