package okaram.samples;

public class Person {
	public String firstName, lastName;
	public int age;
	public String getFullName() {
		return firstName+" "+lastName;
	}
	
	public String toString() {
		return "Person - "+firstName+" "+lastName+" "+age;
	}
	
	public static void main(String args[]){
		Person p1=new Person();
		p1.firstName="Orlando";
		p1.lastName="Karam";
		p1.age=30;
		
		System.out.println(p1.getFullName());
		System.out.println(p1);
	}
}
