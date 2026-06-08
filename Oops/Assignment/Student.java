package Oops.Assignment;

public class Student {
	
	static String collegeName = "SRM";
	
	public void studentData(String name,int rollNo) {
		System.out.println("College Name: " + collegeName + "\nName: " + name +"\nRoll no.:"+ rollNo);
		
	}
	
	public static void main (String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.studentData( "Anirudh", 281);
		s2.studentData( "Test", 282);
	}
}

