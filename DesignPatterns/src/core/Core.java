package core;

import java.util.HashMap;
import java.util.Map;

public class Core {
	 public static int divide(int a, int b) {
	        try {
	            return a / b;
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	            return -1;
	        } finally {
	            System.out.println("Finally block is executed.");
	        }
	    }

	public static void main(String[] args) {
//		 int result = divide(10, 0);
//	     System.out.println("Result: " + result);
		Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        hashMap.put("two", 22);
        System.out.println("Updated HashMap: " + hashMap);
	}
}
