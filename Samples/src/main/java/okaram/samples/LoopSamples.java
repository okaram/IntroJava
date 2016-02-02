package okaram.samples;

public class LoopSamples {

	public boolean isPrime(int n)
	{
		int sq=(int)Math.sqrt(n);
		for(int i=0; i<sq; ++i)
			if(n%i==0)
				return false;
		return true;
	}
	
	int factorial(int n)
	{
		int fac=1;
		for(int i=0; i<n; ++i)
			fac*=n;
		return fac;
	}
	
	public static boolean containsDigit(int number, int digit)
	{
		while(number!=0){
			int lastDigit=number%10;
			if(lastDigit==digit)
				return true;
			number /=10;
		}
		return false;
	}

	
	// other examples
	// power
	// reading until finding good one (while, do-while)
	// find if string contains character (charAt, length)
	// readAndSum - ask whether you have more numbers
	//		readAndAverage, readAnd...
	//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(containsDigit(1235,5));
	}

}
