package core;

public class Test {
	public static void main(String[] args) {
		int a = 100;
		for (int i = 2; i < a; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
