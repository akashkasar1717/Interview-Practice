package factory;

public class FactoryClass {
	public Employee getObject(String empType) {
		if (empType.trim().equals("Android")) {
			return new AndroidDeveloper();
		} else if (empType.trim().equals("Java")) {
			return new JavaDeveloper();
		}
		return null;
	}
}
