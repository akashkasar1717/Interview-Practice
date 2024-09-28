package thread;

public class Volatilekeyword {
	private volatile boolean running = true;

	public void run() {
		System.out.println("Thread started.");
		while (running) {}
		System.out.println("Thread stopped.");
	}

	public void stop() {
		running = false;
	}

	public static void main(String[] args) throws InterruptedException {
		Volatilekeyword example = new Volatilekeyword();
		Thread thread = new Thread(example::run);
		thread.start();
		Thread.sleep(2000);
		example.stop();
		thread.join();
		System.out.println("Main thread finished.");
	}
}
