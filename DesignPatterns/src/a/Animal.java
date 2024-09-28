package a;

public class Animal {

	public static int sum(int... numbers) {
		var sum = 0;
		for (int number : numbers) {
			 sum =sum + number;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(Animal.sum(1,2,3,4));
	}
}
