package thread;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Numbers " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}
}
