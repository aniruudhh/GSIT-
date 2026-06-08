package Polymorphism;

public class Circle  extends Shape {
	
	public void area() {
		int radius = 5;
		System.out.println("Area of Circle: "+ Math.PI * radius * radius);
	}
	
	public static void main (String[] args) {
		Shape s1 = new Circle();
		s1.area();
		Shape s2 = new Rectangle();
		s2.area();
		
		
	}

}
