package okaram.samples;
import java.awt.Point;

public class ArrayExamples {

	public static void useArrays1() {
		int[] arr={1,2,3,4,5}; // declare and initialize, we can use {}
		
		int[] arr2=new int[10]; // 50 cells, but what's their value ?
		for(int i=0; i<arr2.length; ++i) {
			arr[i]=i; // we are initializing here
		}
		
		Point []pointArr={new Point(1,2), new Point(3,4)}; // we can have arrays of objects
				
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

	
	public static int min(int[] arr) {
		// we assume the array is not empty
		int theMin=arr[0];
		for(int i=1; i<arr.length; ++i) {
			if(arr[i]<theMin)
				theMin=arr[i];
		}
		return theMin;
	}

	public static boolean isSorted(int[] arr) {
		for(int i=1; i<arr.length; ++i) {
			if(arr[i]>arr[i-1])
				return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		int arr1[]={1,2,3,4,5};
		printArray(arr1);
	}
}
