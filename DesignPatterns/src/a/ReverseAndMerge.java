package a;

public class ReverseAndMerge {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 6, 7, 8, 9, 10, 11, 12 };

		int length = a.length + b.length;
		int c[] = new int[length];
		int pos = 0;
		for (int i = 0; i < a.length; i++) {
			c[pos] = a[i];
			pos++;
		}
		for (int i = b.length - 1; i >= 0; i--) {
			c[pos] = b[i];
			pos++;
		}
		for (int i = 0; i < length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
