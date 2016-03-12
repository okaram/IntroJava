package okaram.samples;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.Rectangle;

public class UsingObjects {
	public static void playing1() {
		Point pt1 = new Point(10, 10);
		// Point pt2=new Point(5,7);
		Point pt3 = new Point(10, 10);
		Point alias = pt1;
		// pt1.x=5;
		System.out.println(pt1 == pt3);
		System.out.println(pt1 == alias);
		System.out.println(pt1.equals(pt3));
	}

	public static void growRectangle(Rectangle r, int factor) {
		r.width *= factor;
		r.height *= factor;
	}

	static class MyPoint {
		public int x, y;
		public double distanceToOrigin()
		{
			return Math.sqrt(this.x*this.x + this.y*this.y);
		}
	}
	
	public static void main(String[] args) {
		MyPoint p1=new MyPoint();
		MyPoint p2=new MyPoint();
		p1.x=10;
		p1.y=12;
		System.out.println(p1.distanceToOrigin());
	}

}
