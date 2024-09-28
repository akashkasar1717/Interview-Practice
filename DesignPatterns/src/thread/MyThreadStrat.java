package thread;

public class MyThreadStrat {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		AnotherThread t2 = new AnotherThread();
		Thread th = new Thread(t2);
		th.start();
		t1.start();
	}
}
