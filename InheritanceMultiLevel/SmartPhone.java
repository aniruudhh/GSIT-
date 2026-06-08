package InheritanceMultiLevel;

public class SmartPhone extends Mobile {
	
	public void internet() {
		System.out.println("Smart phone has internet access");
	}
	
	public static void main (String[] args) {
		SmartPhone s = new SmartPhone();
		s.start();
		s.calling();
		s.internet();
	}

}
