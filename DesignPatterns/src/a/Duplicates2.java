package a;

public class Duplicates2 {
	public static void main(String[] args) {
//		String str = "w3schools";
//		int cnt = 0;
//		char[] inp = str.toCharArray();
//		System.out.println("Duplicate Characters are:");
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = i + 1; j < str.length(); j++) {
//				if (inp[i] == inp[j]) {
//					System.out.println(inp[j]);
//					cnt++;
//					break;
//				}
//			}
//		}
		
//		-------------------OR------------------------------
		String a="abba";
	    String b="";int count=0;
	    for(int i=0;i<a.length();i++){
	        if(!b.contains(String.valueOf(a.charAt(i)))){
	            b+=a.charAt(i);
	            count++;
	        }
	    }
	    System.out.println(b);
	}
}
