package a;
import java.util.Arrays;

public class MergeArrayPractice {

	public static void main(String args[]) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 10, 11, 12 };

		int length = a.length + b.length;

		int[] c = new int[length];

		int pos = 0;
		for (int i = 0; i < a.length; i++) {
			c[pos] = a[i];
			pos++;
		}

		for (int i = 0; i < b.length; i++) {
			c[pos] = b[i];
			pos++;
		}

		System.out.println(Arrays.toString(c));
	}

}
