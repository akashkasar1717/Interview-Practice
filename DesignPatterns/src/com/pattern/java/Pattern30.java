package com.pattern.java;

public class Pattern30 {
	public static void main(String args[]) {
		int i,j,mid=5;
		int cnt=5;
		for(i=0;i<12;i++) {
			int count = cnt;
			for(j=0;j<6;j++) {
				if(j <= mid) {
					System.out.print((char) (count+65));
					count--;
				}
				
			}
			System.out.println();
			if(i <= 4) {
				mid--;
				cnt--;
			}else if(i>5){
				mid++;
				cnt++;
			}
			
		}
	}

}
