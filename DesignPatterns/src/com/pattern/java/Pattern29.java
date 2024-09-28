package com.pattern.java;

public class Pattern29 {
	public static void main (String rgs[]) {
		int i,j,mid=5;
		for(i=0;i<12;i++) {
			int cnt=0;
			for(j=0;j<6;j++) {
				if(j <= mid) {
					System.out.print((char) (cnt+65));
					cnt++;
				}
				
			}
			System.out.println();
			if(i <= 4) {
				mid--;
			}else  if(i>5){
				mid++;
			}
			
		}
		
	}

}
