package thread1;


public class A1 extends Thread{
	
	int a[];
	int start;
	int end;
	
	public A1(int a[],int start,int end) {
		this.a=a;
		this.start=start;
		this.end=end;
	}
	
	
	
	
	public void run() {
		for(int i=start;i<end;i++) {
			System.out.println("AnotherThread i "+a[i]);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
               e.printStackTrace();
			}
		}		
	}
}
