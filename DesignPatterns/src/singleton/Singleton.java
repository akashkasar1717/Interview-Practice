package singleton;

public class Singleton {
	//lazy initialization
	private static Singleton obj;

	private Singleton() {}

	public static Singleton getSingleton() {
		if (obj == null) {//synchronized :if multiple threads come simultaneously to create the object 
			synchronized (Singleton.class) {
				if (obj == null) {
					obj = new Singleton();
				}
			}
		}
		return obj;
	}
	
	public Singleton readResolve() {
		return null;
	}
}
