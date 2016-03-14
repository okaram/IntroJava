package okaram.samples;


class Person {
	public String firstName, lastName;
	public int age;
	
	public Person(String firstName, String lastName, int age)
	{
		this.firstName=firstName; // the ones without this are the parameters
		this.lastName=lastName;
		this.age=age;
	}
	
	public Person() {
		
	}
	
	public String getFullName() {
		return this.firstName+" "+this.lastName; // you can use this. to access instance variables (but don't have to)
	}
	
	public String getFormalFullName() {
		return lastName+", "+firstName; // you can reference instance variables without the this.
	}
	
}

public class SimpleClasses {

	
	public static void main(String args[])
	{
		Person p1=new Person();
		p1.firstName="Orlando";
		p1.lastName="Karam";
		
		System.out.println(p1.getFullName());
		System.out.println(p1.getFullName());
	}
}
