package a;

import java.util.ArrayList;
import java.util.List;

public class ABC {
	public static void main(String[] args) {
		int[] arr = {5,12,67,3,7,1,67,12,5,5,67,88};
//		 int arr[]={1,2,1,1,2,3,3};
//			int[] arr = {5,12,67,3,7,1,67,12,5};


		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("---------------------");
	}
}
