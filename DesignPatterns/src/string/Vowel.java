package string;

public class Vowel {

	public static void main(String[] args) {
		System.out.println(vowel("sh"));
		System.out.println(isPrime(49));
	}

	private static boolean vowel(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}
	
	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
