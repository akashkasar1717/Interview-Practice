package thread1;

public class ABC {
	public static void main(String[] args) {
		 int a []={1,2,3,4,5,6,7,8,9,10};
		
		int c=0;
		int b=a.length/2;
		int d=a.length;
		A1 t1=new A1(a,c,b);
		A2 t2=new A2(a,b,d);
		Thread th=new Thread(t1);
		th.start();
		
		
		try {
			th.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

//		t2.start();
//		
//		try {
//			t2.join();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
	}
}
