package core;

public class MergeArr {
	public static void main(String[] args) {
		int[] arrayA = new int[] { 1, 2, 3, 4, 5 };
		int[] arrayB = new int[] { 6, 7, 8, 9, 10 };

		int finalLength = arrayA.length + arrayB.length;
		int[] finalArr = new int[finalLength];

		int position = 0;

		for (int i = 0; i < arrayA.length; i++) {
			finalArr[position] = arrayA[i];
			position++;
		}

		for (int i = 0; i < arrayB.length; i++) {
			finalArr[position] = arrayB[i];
			position++;
		}

		for (int i = 0; i < finalArr.length; i++) {
			System.out.print(finalArr[i] + " ");
		}
	}
}
