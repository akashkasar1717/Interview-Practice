package comparable.comparator;

import java.util.Arrays;

public class StartMain {

	public static void main(String[] args) {
		Employee[] arr=new Employee[4];
		arr[0]=new Employee(4, "Akash");
		arr[1]=new Employee(1, "Akshay");
		arr[2]=new Employee(9, "Onkar");
		arr[3]=new Employee(5, "Navnath");
		
//		Arrays.sort(arr);
		Arrays.sort(arr,Employee.nameComparator);
		for(Employee  a :arr) {
			System.out.println(a.name);
		}
	}
}
