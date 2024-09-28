package a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StramsApi {

	public static void main(String[] args) {
		Employee emp1=new Employee("Akash", 40,50000);
		Employee emp2=new Employee("Vishal", 30,10000);
		Employee emp3=new Employee("Akshay", 20,70000);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		double emp =list.stream().map((a->a.getSalary())).max(Comparator.naturalOrder()).orElseThrow();//peek(a->a.getSalary())
		System.out.println(emp);
	}
}
