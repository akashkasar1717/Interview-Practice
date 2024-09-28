package singleton;

public class Singleton1 {
	//early initialization
	private static Singleton1 obj=new Singleton1();
	
	private Singleton1() {}
	
	public static Singleton1 getSingleton1() {
		return obj;
	}
	
}
