package ll;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class D {

	public static void main(String[] args) {
		String str1 = "abcdABCDabcd";
		char[] chars = str1.toCharArray();
		Map<Object,Long> objMap = new String(chars).chars().mapToObj(s->(char)s).collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(objMap);
        
//        Map<Character, Integer> charsCount = new HashMap<>();
//        for (char c : chars) {
//        	if (charsCount.containsKey(c)) {
//        		charsCount.put(c, charsCount.get(c) + 1);
//        	} else
//        		charsCount.put(c, 1);
//        }
        
        String str = null;
        String str12="abc";

        System.out.println(str12.equals("abc") | str.equals(null));

	}
}
