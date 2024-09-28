package patterns;

public class BinaryNo {
	private static String convertToBinary(int num) {
		String s1 = "";
		int odd = 0;
		int count = 0;
		int num2 = num;
		
		while (num > 0) {
			count++;
			int abc = num % 2;
			num = num / 2;
		}
		if(count<=4) {
			count=4;
		}
		int[] arr = new int[count];
		while (num2 > 0) {
			arr[odd++] = num2 % 2;
			num2 = num2 / 2;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			s1 = s1.concat(arr[i] + "");
		}
		return s1;
	}

	public static void main(String[] args) {
		System.out.println(convertToBinary(800));
	}
}
