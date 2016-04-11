package okaram.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.awt.*;
public class CollectionExamples {
	public static void listIterationExample() {
		List<Integer> numbers=Arrays.asList(1,2,3,4);
		for(int n : numbers) {
			System.out.println(n);
		}
	}
	
	Point lowestXY(List<Point> points) {
		if(points.isEmpty())
			return null;
		Point low=points.get(0);
		for(Point p : points) {
			if(p.x < low.x)
				p.x=low.x;
			if(p.y<low.y)
				p.y=low.y;
		}
		return low;
	}
	
	public static void main(String args[]){
		listIterationExample();
	}
}
