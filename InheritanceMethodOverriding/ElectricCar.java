package InheritanceMethodOverriding;

public class ElectricCar extends Vehicle { 
	
	 public void fuelType() {
		 System.out.println("Runs on electricty");
	 }

	 public static void main(String[] args) {
		 ElectricCar ec = new ElectricCar();
		 ec.fuelType();
		 
		 Vehicle v = new Vehicle();
		 v.fuelType();
	 }
}
