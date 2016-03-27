package okaram.samples;

import java.time.LocalDate;

class BasePerson {
	protected String name; // using protected so descendants can change
	protected LocalDate dateOfBirth; 
	
	public BasePerson(String name, LocalDate dateOfBirth){
		this.name=name;
		this.dateOfBirth=dateOfBirth;
	}
	
	public String getName() { return this.name;}
	public LocalDate getDateOfBirth() { return this.dateOfBirth;}
}

class Employee extends BasePerson { // it gets name and dob from BasePerson
	protected String ssn;
	public Employee(String name, LocalDate dateOfBirth, String ssn) {
		super(name, dateOfBirth); // this calls the constructor for BasePerson
		this.ssn=ssn;
	}
	public String getSsn() { return this.ssn;}
}

public class InheritancePeopleExample {
	public static void main(String args[]) {
		BasePerson p=new BasePerson("Orlando Karam", LocalDate.of(1972, 1, 1));
	
		Employee e=new Employee("Orlando Karam", LocalDate.of(1972,1,1), "123-45-6789");
		System.out.println(e.getName()); // getName comes from BasePerson !
	}
}
