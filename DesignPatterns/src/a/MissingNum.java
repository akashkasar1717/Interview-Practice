package a;

public class MissingNum {
	public static void main(String[] args) {
		int[] arr = { 21, 22, 23, 25, 26 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum / arr.length + 1);
	}
}
