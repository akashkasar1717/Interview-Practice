package thread1;

public class MyThreads {

	public static void main(String[] args) throws InterruptedException {
		Thread1 thread1=new Thread1();
		Thread1 thread2=new Thread1();
		thread1.setPriority(10);
		thread1.setDaemon(true);
		thread1.start();
//		synchronized (thread1) {
//			Thread.sleep(1000);
//		}
		thread2.start();
	}
}
