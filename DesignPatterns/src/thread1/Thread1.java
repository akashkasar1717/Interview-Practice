package thread1;

public class Thread1 extends Thread {

	@Override
	public void run() {
		System.out.println("Akash");
		System.out.println(Thread.currentThread().getName());
	}

}
