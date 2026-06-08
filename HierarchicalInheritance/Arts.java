package HierarchicalInheritance;

public class Arts extends Course {
	public void  architecture() {
		System.out.println("architecture is main branch of arts");
	}

	public static void main (String[] args) {

		Arts a = new Arts();
		a.courseInfo();
		a.architecture();
		
		Commerce c = new Commerce();
		c.economy();
		
		Science s = new Science();
		s.biology();
		
		
	}
}
