package core;

public class Prime {
	public static void main(String[] args) {
		int a = 17;
		if (checkPrime(a))
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

	private static boolean checkPrime(int num) {
		boolean flag = false;
		if (num == 0 || num == 1) {
			flag = true;
		}
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		return !flag;
	}
}