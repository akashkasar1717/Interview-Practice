package a;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainEmployee {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		Employee employee1=new Employee("Akash",30,70000);
		Employee employee2=new Employee("Onkar",20,20000);
		Employee employee3=new Employee("Akshay",25,10000);
		Employee employee4=new Employee("Rahul",35,40000);
		Employee employee5=new Employee("Navnath",24,50000);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		List<Employee> list1= list.stream().filter(a -> a.getAge() > 25).peek(employee -> employee.setSalary(employee.getSalary() * 1.10)).collect(Collectors.toList());
		
		List<Employee> list2 =  list.stream().map(e->{
			if(e.getAge()>25) {
				e.setSalary(e.getSalary()*1.10);
			}
			return e;
		}).collect(Collectors.toList());
		System.out.println(list2);// it allows you to perform intermediate operations on the elements in the stream
	}

}//list of increase salary of employee 10% whose age is greater than  25
