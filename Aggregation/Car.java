package Aggregation;

public class Car {
	Engine e = new Engine();
	
	public void displayEngineDetails() {
		
		System.out.println("Car Details:");
		e.engineInfo();
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.displayEngineDetails();
		
	}

}
