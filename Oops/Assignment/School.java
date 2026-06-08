package Oops.Assignment;

public class School {
	
	String name;
	
	School(){
		System.out.println("Bhashyam High School");
	}
	
	public void schoolLocation() {
		
		System.out.println("This School is based out of Kolkata");
	}
	
	public static void main (String[] args) {
		
		School s = new School();
		s.schoolLocation();
		}

}
