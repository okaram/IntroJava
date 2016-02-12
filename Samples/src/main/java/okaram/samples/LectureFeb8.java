package okaram.samples;

import java.util.Scanner;

public class LectureFeb8 {

	// returns the biggest
	public static int max2(int n1, int n2)
	{
		if(n1>n2) {
			return n1;
		} else {
			return n2;
		}
	}
	
	public static int max3n(int n1, int n2, int n3)
	{
		if(n1>=n2) {
			if(n1>=n3)
				return n1;
			else {
				return n3;
			}
		} else {
			if (n2>=n3)
				return n2;
			else
				return n3;
		}
	}

	public static int max3c(int n1, int n2, int n3)
	{
		if(n1>=n2 && n1>=n3) {
				return n1;
		} else if (n2>=n1 && n2>=n3){
				return n2;
		} else {
			return n3;
		} 
	}

	public static int max3(int n1, int n2, int n3)
	{
		return max2(max2(n1,n2),n3);		
	}

	public static int max4(int n1, int n2, int n3, int n4)
	{
		return max2( max2(n1,n2), max2(n3,n4));
	}
	
	public static int max4c(int n1, int n2, int n3, int n4)
	{
		if(n1>=n2 && n1>=n3 && n1>=n4) {
			return n1;
		} else if (n2>=n1 && n2>=n3 && n2>=n4){
			return n2;
		} else if (n3>=n1 && n3>=n2 && n3>=n4){
			return n3;
		} else {
			return n4;
		}		
	}
	
	
	public static int power(int base, int exponent)
	{
		if(exponent<=0)
			return 1;
		else
			return base*power(base, exponent-1);   
	}

	// keep reading and adding until it reads 0
	// returns the sum
	public static int readAndAdd(Scanner in)
	{
		System.out.println("Please enter a number (0 to end)");
		int num1=in.nextInt();
		if(num1==0)
			return 0;
		else {
			int sumOfRest=readAndAdd(in);
			return num1+sumOfRest;
		}
	}
	
	
	public static int power(int base, int exponent, int currentTotal)
	{
		if(exponent<=0)
			return currentTotal;
		else
			return power(base, exponent-1, base*currentTotal);   
	}
	
	public static void nomain(String[] args) {
		Scanner input=new Scanner(System.in);
		int sum=readAndAdd(input);
		System.out.print("The sum is " +sum);
		System.out.println("\n\t\tThat's all folks");
	}

	
	// numberOfAs("abcaabca",3) => 3
	// numberOfAs("abcaabca",0) => 4
	// numberOfAs("abcaabca",8) => 0
	public static int numberOfAs(String s, int from)
	{
		if(from >= s.length())
			return 0;
		else {
			int numAsHere=0;
			if (s.charAt(from)=='a')
				numAsHere=1;
			int numAsInRest=numberOfAs(s, from+1);
			return numAsHere+numAsInRest;
		}
	}
	public static void main(String[] args) {
		String word="abracadabra";
		System.out.println(word.charAt(2));
		System.out.println(word.length());
		System.out.println(numberOfAs(word, 0));
	}
}
