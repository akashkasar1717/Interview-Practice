package comparable.comparator;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee ids) {
		return this.id-ids.id;
	}
	
	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee emp1, Employee emp2) {
			return emp1.getName().compareTo(emp2.getName());
		}
	};
}
