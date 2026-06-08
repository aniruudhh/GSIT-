package Oops.Assignment;

public class Shape {
	
	int length = 10;
	
	public void square() {
		int areaSquare = length * length;
		System.out.println("Area of square: "+ areaSquare);
	}
	
	public void rectangle() {
		int breadth = 15;
		int areaRect = length * breadth;
		System.out.println("Area of rectangle: "+ areaRect);
	}
	
	public void circle() {
		double areaCircle = Math.PI * length * length;
		System.out.println("Area of circle: "+ areaCircle);
	}
	
	public static void main(String[] args) {
		Shape s = new Shape();
		
		s.square();
		s.rectangle();
		s.circle();
	}

}
