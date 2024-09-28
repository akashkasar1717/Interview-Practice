package a;

public class SumRequired {
public static void main(String[] args) {
	int[] sumRequired = {8, 4, 2, 1};
	int target = 15;

	for (int i = sumRequired.length - 1; i >= 1; i--) {
	    for (int k = i - 1; k >= 0; k--) {
	        if (sumRequired[i] + sumRequired[k] == target) {
	            System.out.println("Elements: " + sumRequired[i] + " and " + sumRequired[k]);
	            break;
	        }
	    }
	}

}
}
