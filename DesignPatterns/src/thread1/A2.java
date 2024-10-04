package thread1;

public class A2 implements Runnable {

	int a[];
	int start;
	int end;

	public A2(int[] a, int start, int end) {
		this.a = a;
		this.start = start;
		this.end = end;
	}


	public void run() {
		for(int i=start;i<=end;i++) {
			System.out.println("MyThread i "+a[i]);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
               e.printStackTrace();
			}
		}		
	}
	
}