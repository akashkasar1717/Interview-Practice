package a;

public class JavaStack {

	public enum Day {

		PI(3.14);

		private final double value;

		Day(double db) {
			this.value = db;
		}
	}

	public static void main(String[] args) {
//		double area = Day.PI.value;
//		byte b1 = 10;
//		byte b2 = (byte) (b1 + 2);
//		System.out.println(b2);
//		float f1 = 9.9f;
		double a= 70000;
		double b=a*0.01;
		System.out.println(b);
	}
}
