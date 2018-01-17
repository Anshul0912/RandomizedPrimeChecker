package challenge2;

public class Contact {

	//Properties of contact class declared private for data encapsulation
	
	
	private int id;
	private String name;
	private String phone;
	private String address;
	
	public Contact(int id, String name, String phone, String address) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	 }
	
	//get data method as per the requirement which return the data
	
	
	public String getData() {
		
		return String.format("ID: %d NAME: %s PHONE: %s ADDRESS: %s", this.id,this.name,this.phone,this.address);
		
	}
}

