package a;

public class OP {
	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 3, 4 };
		int b[] = { 5, 6, 7, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			boolean dup = true;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					dup = false;
				}
			}
			if (!dup)
				System.out.print(a[i] + " ");
		}
	}
}
