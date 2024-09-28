package com.pattern.java;

public class Pattern106 {
	public static void main(String args[]) {
		int i,j,mid=0;
		int cnt=1;
		for(i=0;i<5;i++) {
			int count=cnt;
			for(j=0;j<5;j++) {
				if(j <= mid) {
					System.out.print(count);
					if(count == 1) {
						count--;
					}else {
						count++;
					}
					
				
				}
			}
			System.out.println();
			mid++;
			if(cnt == 1) {
				cnt--;
			}else {
				cnt++;
			}
			
		}
	}

}
