package a;

public class MinNum {
	public static void main(String[] args) {
		int[] arr = { 10, 1, 3, 7, 13 };
		int min = arr[0];
		for (int a : arr) {
			if (a < min) {
				min = a;
			}
		}
		System.out.println(min);
	}
}
