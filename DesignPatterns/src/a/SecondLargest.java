package a;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 3, 7, 1 };
		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if(arr[i] > secondMax && arr[i] < max) {
				secondMax = arr[i];
			}
		}
	    System.out.println(secondMax);
	}
}
