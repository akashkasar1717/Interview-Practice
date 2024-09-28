package a;

import java.io.Serializable;

public class Rectangle implements Serializable  {
		
	int length;
	int breadth;
	transient int area;
	
	public Rectangle(int length, int breadth) {
		area = length * breadth;
	}	
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(2, 2);
		System.out.println(rectangle.area);
	}
}
