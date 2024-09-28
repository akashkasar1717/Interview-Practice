package a;

public class Arrays1234 {

	public static void main(String[] args) {
//		String[] a = { "21", "11", "1", "12", "101" };
//		for (int i = 0; i < a.length; i++) {
//			if (a[i].startsWith("1")) {
//				System.out.println(a[i]);
//			}
//		}

		String[] a = { "21", "11", "1", "12", "101" };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length();) {
				if (String.valueOf(a[i].charAt(j)).equals("1")) {
					System.out.println(a[i]);
				}
				break;
			}
		}
	}
}
