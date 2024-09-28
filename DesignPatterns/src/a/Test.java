package a;

public class Test {
public static void main(String[] args) {
        // Implicit casting (widening)
        int num = 100;
        double d = num; //        No explicit cast needed

        // Explicit casting (narrowing)			
        double value = 9.78;
        int intValue = (int) value; /* Must explicitly cast */

        System.out.println("Explicitly casted value: " + intValue); // Outputs 9
         while(true) {
        	System.out.println("implicitly casted value: " + d); // Outputs 100.0        	
        }
    }
}
