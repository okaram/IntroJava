package okaram.samples;

public class BoxingExamples {

	public static void IntegerExample() {
		Integer i=new Integer(3);
		int j=i.intValue();
		
		int k=i;
		System.out.println(i.toString() + " "+ j + k);
	}

	public static void main(String[] args) {
		IntegerExample();
	}

}
