package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapEg {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1, 2, 3);
		List<Integer> list2=Arrays.asList(3, 4);
		
		List<Integer> combinedList = Stream.of(list1,list2).flatMap(List::stream).collect(Collectors.toList()); 
		System.out.println(combinedList);
	}
}
