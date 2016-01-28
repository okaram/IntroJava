package okaram.samples;

public class RecursionSamples {
	
	public static String stringTimes(String base, int times) {
		if(times<=0)
			return "";
		else
			return base + stringTimes(base, times-1);
	}
	
	public static String stringTimesAccum(String base, int times, String Accum) {
		if(times<=0)
			return Accum;
		else
			return stringTimesAccum(base, times-1, base+Accum);
	}
	
	public int pow(int base, int exponent) {
		if(exponent<=0)
			return 1;
		else
			return base*pow(base,exponent-1);
	}
	
	public int factorial(int n) {
		if(n<=0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
