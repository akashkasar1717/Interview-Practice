package ll;
 
public class A {
	public static void main(String[] args) {
		int[] array = { 4, 2, 3, 1, 5 };
		int sum = 0;
		for (int i : array)
			sum += i;
		//System.out.println(sum);
		System.out.println(findSecondHighest(array));
	}
	
	private static int findSecondHighest(int[] array) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		return secondHighest;
	}

}
