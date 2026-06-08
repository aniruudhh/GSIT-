package Oops.Assignment;

public class School1 {
	
	String name;
	String address;
	String strength;
	
	School1(String name, String strength){
		this.name = name;
		this.strength = strength;
		
	}
	
	School1(String name, String strength, String address){
		this.name = name;
		this.strength = strength;
		this.address = address;
	}
	
	public void displayDetails() {
		if (address == null) {
			address = "Not available";
		}
		System.out.println("Name: "+ name + "\naddress: "+ address + "\nStrength: "+ strength);
	}
	
	public static void main (String[] args) {
		School1 s = new School1("Anirudh", "Nothing");
		School1 s2 = new School1("Anirudh", "Nothing", "Bengaluru");
		s.displayDetails();
		s2.displayDetails();
				
}
}