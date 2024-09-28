package factory;

import java.util.Scanner;

public class DeveloperClient {

	public static void main(String[] args) {//this design pattern is also known as virtual constructor
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your object input");
		String input=sc.nextLine();
		FactoryClass factory = new FactoryClass();
		Employee emp=factory.getObject(input);
		if(emp !=null) {		
			emp.salary();
		}else {
			System.out.println("No object Found");
		}
		sc.close();
	}
}
