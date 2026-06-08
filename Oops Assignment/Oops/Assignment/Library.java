package Oops.Assignment;

public class Library {
	
	String libraryName = "The Asiatic Society";
	
	Library(){
		System.out.println("Welcome to " + libraryName + " Library!");
	}
	
	public void showLocation(String city) {
		System.out.println("This Library is located in " + city);
	}
	
	public static void main (String[] args) {
		Library l1 = new Library();
		
		l1.showLocation("Mumbai");
		
	}

}
