package a;

public class Code {
	public static void main(String[] args) {
		int[] arr = {10,1,3,7,13};
		int max=0;
		for(int a:arr) {
			if(a>max) {
				max=a;
			}
		}
		System.out.println(max);
	}
}
