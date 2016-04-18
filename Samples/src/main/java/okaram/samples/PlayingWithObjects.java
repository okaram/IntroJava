class Person {
    private String firstName, lastName;
    private int age;

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
    
    public void setFirstName(String p_firstName) {this.firstName=p_firstName;}
    // you define the other two
    
    public Person(String p_firstName, String p_lastName, int p_age)
    {
    	this.firstName=p_firstName;
    	this.lastName=p_lastName;
    	this.age=p_age;
    }
    
    public Person(String p_firstName, String p_lastName)
    {
    	this.firstName=p_firstName;
    	this.lastName=p_lastName;
    	this.age=18;
    }

    public String getFullName() {
    	return this.firstName+" "+lastName;
    }
    
    public String getFormalFullName() {
    	return this.lastName+", "+this.firstName;
    }
    
    public boolean isOldEnoughToDrinkAlcohol() {
    	return age>=21;    	
    }
}

class Fraction {
	private int numerator,denominator;
	public int getNumerator() { return numerator;}
	public int getDenominator() { return denominator;}
	
	public Fraction(int p_numerator, int p_denominator){
		this.numerator=p_numerator;
		this.denominator=p_denominator;
		
		if(this.denominator==0) {
			this.numerator=0;
			this.denominator=1;
		}
	}
	
	public String toString() {
		return this.numerator+"/"+this.denominator;
	}
}

public class PlayingWithObjects {

	public static boolean isOldEnoughToDrinkAlcohol(Person p)
	{
		return p.getAge()>=21;
	}
	
	public static void main(String args[]) {
		Fraction f=new Fraction(3,5);
		System.out.println(f);
	}
	
}
