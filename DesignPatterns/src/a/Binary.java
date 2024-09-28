package a;

public class Binary {
	private static String convertToBinary(int num) {
		int[] arr = new int[4];
		int[] sumRequired = { 8, 4, 2, 1 };
		String s1 = "";
		if (num > -1) {
			int myIndex1 = 0, myIndex2 = 0;
			for (int i = 0; i < sumRequired.length; i++) {
				if (num == sumRequired[i]) {
					arr[i] = 1;
				} else {
					if (num > 0) {
						int sum = 0;
						for (int j = sumRequired.length - 1; j > 0; j--) {
							for (int k = i - 1; k >= 0; k--) {
								if (sumRequired[j] + sumRequired[k] == num) {
									sum = sum + sumRequired[j] + sumRequired[k];
									myIndex1 = sumRequired[j];
									myIndex2 = sumRequired[k];
								}
							}
						}
					}
				}
			}
			for (int i = 0; i < sumRequired.length; i++) {
				if (sumRequired[i] == myIndex1 || sumRequired[i] == myIndex2) {
					arr[i] = 1;
				}
			}
			for (int array : arr) {
				s1 = s1.concat(array + "");
			}
		} else {
			s1 = "Enter a valid Number.";
		}
		return s1;
	}

	public static void main(String[] args) {
		System.out.println(convertToBinary(11));
	}
}
