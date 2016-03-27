package okaram.samples;

import java.util.Random;
interface IShapeWithArea {
	double getArea();
}
interface IShapeWithPerimeter {
	double getPerimeter();
}

interface IShape2 extends IShapeWithArea, IShapeWithPerimeter {
	
}
interface IShape {
	double getArea();
	double getPerimeter();
}

class Rectangle implements IShape {
	private double width, height;
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	
	@Override
	public double getArea() { return width*height; }
	
	@Override
	public double getPerimeter() { return 2*(width+height); } 
	
	@Override
	public String toString(){ return "Rectangle[width:"+width+" height:"+height+"]"; }
}

class Circle implements IShape {
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double getArea() { return Math.PI*radius*radius;}
	public double getPerimeter() {return 2*radius*Math.PI;} 
	public String toString(){ return "Circle[radius:"+radius+"]"; }
}




public class InterfaceExamples {
	public static String formatAreaAndPerimeter( IShape s) {
		return s.toString()+" - Area: "+s.getArea()+" Perimeter: "+s.getPerimeter();
	}
	public static void main(String args[]){
		IShape shp=new Rectangle(3,4);
		System.out.println ("Area: "+shp.getArea()+ " perimeter:" +shp.getPerimeter());
		shp=new Circle(3);
		System.out.println("Area: "+shp.getArea()+ " perimeter:" +shp.getPerimeter());
		
		System.out.println(formatAreaAndPerimeter(shp));
		
		IShape shapes[]={new Rectangle(1,2), new Rectangle(3,4), new Circle(2)};
		for(IShape s: shapes) {
			System.out.println(formatAreaAndPerimeter(s));
		}
	}
}
