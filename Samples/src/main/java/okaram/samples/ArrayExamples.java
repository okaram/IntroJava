package okaram.samples;
import java.awt.Point;

public class ArrayExamples {

	public static void useArrays1() {
		int arr[]={1,2,3,4,5}; // declare and initialize, we can use {}
		Point pointArr[]={new Point(1,2), new Point(3,4)};
		
	}
	

	public static String arrayToString(int[] arr){
		if(arr.length==0)
			return "";
		String accum="";
		for(int i=0;i<arr.length-1;++i) {
			accum+=arr[i]+",";
		}
		accum+=arr[arr.length-1];
		return accum;
	}
	
	public static void printArray(int[] arr){
		for(int i=0; i<arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}
	
	public static void printArrayForeach(int[] arr){
		for(int elem: arr) {
			System.out.println(elem);
		}
	}
	
	public static void main(String args[]) {
		int arr1[]={1,2,3,4,5};
		printArray(arr1);
	}
}
