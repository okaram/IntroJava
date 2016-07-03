package karamo;

import java.util.*;
public class DirectoryExample {

	static class Contact {
		public String name, email, phone;
		
		public Contact(String name, String email, String phone) {
			this.name=name;
			this.email=email;
			this.phone=phone;
		}
		
		@Override
		public String toString() {
			return name + "- " + email + " - " + phone;
		}
	}
	
	static class Directory {
		Map<String, Contact> contacts=new HashMap<String,Contact>();
		
		public void addContact(Contact c) {
			contacts.put( c.name, c);
		}
		
		public Contact findByName(String name) {
			return contacts.get(name);
		}
		
		public List<Contact> getAllContacts() {
			return new ArrayList<Contact>(contacts.values());
		}
	}
	
	public static void main(String args[]) {
		Contact c1=new Contact("Orlando K", "ok@ok.com", "123-4567");
		Contact c2=new Contact("Lina C", "lc@lc.com", "123-4567");
		Contact c3=new Contact("Jane Doe", "jd@jd.net", "123-4577");
		
		Directory d=new Directory();
		d.addContact(c1);
		d.addContact(c2);
		d.addContact(c3);
		
		System.out.println(d.findByName("Orlando K"));
		
		for(Contact c : d.getAllContacts() ) {
			System.out.println(c);
		}
	}
}
