package a;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Strings {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Akash", 9);
		map.put("Onkar", 1);
		map.put("Akashay", 3);
		map.put("Rahul", 2);
		map.put("Priyanka", 6);
		map.put("Sabiha", 7);
		map.put("Vaishnavi", 5);
		
		LinkedHashMap<String, Integer> linkedmap = map.entrySet().stream().sorted((e1,e2)->{
			return e1.getValue()-e2.getValue();
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
		
		System.out.println(linkedmap.entrySet());
	}
}
