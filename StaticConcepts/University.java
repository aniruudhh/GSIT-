package StaticConcepts;

public class University {
	
	static String country;
	String universityName;
	
	public void SRM() {
		universityName = "SRM";
		System.out.println(universityName + " is located in " + country);
	}
	
	public void VIT() {
		universityName = "VIT";
		System.out.println(universityName + " is located in " + country);		
	}
	
	public static void main (String[] args) {
		country = "India";
		University s = new University();
		University v = new University();
		s.SRM();
		v.VIT();
	}
}
