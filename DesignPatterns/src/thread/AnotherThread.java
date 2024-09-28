package thread;

public class AnotherThread implements Runnable {

	@Override
	public void run() {
		int a = 100;
		for (int i = 2; i < a; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println("prime " + i);
				try {
					Thread.sleep(4000);
				} catch (Exception e) {

				}
			}
		}
	}
}
