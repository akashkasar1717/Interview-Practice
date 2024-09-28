package string;

import java.util.Arrays;
import java.util.List;

public class RevString {

	public static void main(String[] args) {
		String str = "123";
//		printFibonacciSequence(10);
//		System.out.println(reverse(str));
		
//		System.out.print("A Fibonacci sequence of " + 10 + " numbers: ");
//    	for (int i = 0; i < 10; i++) {
//      	    System.out.print(fibonacci(i) + " ");
//    	}
//		System.out.print(onlyOddNumbers(Arrays.asList(2,4,5)));
//		System.out.println(removeWhiteSpaces("Aka sh"));
		System.out.println(factorial(5));
	}
	
	private static String reverse(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		String[] chars = in.split("");

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		return out.toString();
	}
	
	private static void printFibonacciSequence(int count) {
		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 1; i <= count; i++) {
			System.out.print(a + ", ");
            a = b;
			b = c;
			c = a + b;
		}
	}
	
	public static int fibonacci(int count) {
		if (count <= 1)
			return count;

		return fibonacci(count - 1) + fibonacci(count - 2);
	}
	
	public static boolean onlyOddNumbers(List<Integer> list) {
		return list.parallelStream().anyMatch(x -> x % 2 != 0);
	}
	
	static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for (char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}
		return output.toString();
	}
	
	public static long factorial(long n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}


}
