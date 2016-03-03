package okaram.samples;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Rectangle;

public class UsingObjects {
	public static void playing1() {
		Point pt1=new Point(10,10);
		Point pt2=new Point(5,7);
		Point pt3=new Point(10,10);
		
		System.out.println(pt1.x);
		pt1.x=12;
		System.out.println(pt1.getX());
		System.out.println(pt1.toString());
		System.out.println(pt1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playing1();
	}

}
