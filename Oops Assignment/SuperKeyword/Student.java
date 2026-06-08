package SuperKeyword;

public class Student extends Person{

	Student(){
		super();
		System.out.println("Student Craeted");
	}
	
	public static void main (String[] args) {
		Person p1 = new Student();
		
	}
}
