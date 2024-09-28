package com.pattern.java;

public class Pattern77 {
	public static void main(String args[]) {
		int i,j,mid=0;
//		int cnt=1;
//		for(i=0;i<5;i++) {
//			int count =cnt;
//			for(j=0;j<5;j++) {
//				if(j <= mid) {
//					System.out.print(count + " ");
//					if(j ==0) {
//						count=count+4;
//					}					
//					if(j ==1) {
//						count=count+3;
//					}
//					if(j ==2) {
//						count=count+2;
//					}
//					if(j ==3) {
//						count=count+1;
//					}
//				}
//				
//			}
//			System.out.println();
//			mid++;
//			cnt++;
//		}
		
		
		for(i=0;i<5;i++) {
			int cnt=i+1;
			int diff=4;
			for(j=0;j<5;j++) {
				if(j <= mid) {
					System.out.print(cnt+" ");
					cnt=cnt+diff;
					diff--;
				}
			}
			System.out.println();
			mid++;
		}
		
	}

}
