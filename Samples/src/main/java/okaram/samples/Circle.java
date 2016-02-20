package okaram.samples;


public class Circle {
	public static final double PI=3.14159;
	private double radius;
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r){
		radius=r;
	}
	
	public double getArea(){
		return PI*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*PI*radius;
	}
}
