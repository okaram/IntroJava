Class Inheritance
===

Although this is often misused, a useful OO programming concept, supported by Java, is that of *class inheritance*; we can declare a class to be a subclass of another, and the subclass inherits both fields and behavior (instance variables and methods) from the superclass. 

For example, we can define a class called BasePerson, from which to inherit (it is common to class a superclass a base class, especially if it will be inherited by more than one class):

```
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
```

And then we could define another class, Employee that extends this BasePerson class:
```
class Employee extends BasePerson { // it gets name and dob from BasePerson
	protected String ssn;
	public Employee(String name, LocalDate dateOfBirth, String ssn) {
		super(name, dateOfBirth); // this calls the constructor for BasePerson
		this.ssn=ssn;
	}
	public String getSsn() { return this.ssn;}
}
```

By just declaring that `class Employee extends BasePerson`, the Employee class also has a `name` and `dateOfBirth` fields, and methods `getName` and `getDateOfBirth`. Notice that, since we declared name and dateOfBirth to be `protected` in BasePerson, they can be directly accessed in Employee (if we had declared them private, then Employee could not directly access them and would have to access them trough public or protected methods).

Notice also the weird line in Employee's constructor:
```java
		super(name, dateOfBirth); // this calls the constructor for BasePerson
```

This line uses the keyword `super`, which calls the constructor of the super-class (and has to be the first line in a subclass' constructor).
