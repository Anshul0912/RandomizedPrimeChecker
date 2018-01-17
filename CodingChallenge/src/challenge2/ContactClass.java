package challenge2;

import java.util.ArrayList;
import java.util.Iterator;

 

public class ContactClass {

	public static void main(String[] args) {
		 
		ArrayList<Contact> contact = new ArrayList<>();
		Contact c1 = new Contact(1, "Anshul", "6602382090", "410 Franklin Ave");
		Contact c2 = new Contact(2, "Dev", "660238441", "310 B Anderson St");
		Contact c3 = new Contact(3, "Abhideep", "660237867", "554 Jefferson St");

		contact.add(c1);
		contact.add(c2);
		contact.add(c3);
		
		
		Iterator<Contact>  i  = contact.iterator();
		
		 while(i.hasNext()) {
			  System.out.println(i.next().getData());
		 }
		
	}
	

}
