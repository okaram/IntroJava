package okaram.samples;

import java.util.Scanner;

public class Feb1 {

	public static int power(int base, int exponent) 
	{
		if(exponent==0)
			return 1;
		else 
			return base * power(base, exponent-1);
	}
	
	public static void printCountdown(int n)
	{
		if(n<0)
			return;
		else {
			System.out.println(n);
			printCountdown(n-1);
		}
	}
	
	public static void playGuessNumber(Scanner in, int n)
	{
		System.out.println("Guess my number");
		int guess=in.nextInt();
		if(n==guess) {
			System.out.println("yay !!! :)");
		} else {
			System.out.println("nya nya nya nya nya");
			playGuessNumber(in,n);
		}
	}
	
	public static void guessNumber(Scanner in, int low, int high)
	{
		int guess=(low+high)/2;
		System.out.println("Is it "+guess);
		boolean isIt=in.nextBoolean();
		if(isIt) {
			System.out.println("I'm a genius !!!");
		} else {
			System.out.println("Is it too high?");
			boolean tooHigh=in.nextBoolean();
			if(tooHigh) {
				guessNumber(in, low, guess-1);
			} else {
				guessNumber(in, guess+1,high);
			}
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//playGuessNumber(in, 7);
		guessNumber(in, 1,100);
//		playGuessNumber(in, 13);
	}

}
