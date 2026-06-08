package Oops.Assignment;

public class Calculator {
	
	public void add( int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public static void main (String[] args) {
		Calculator c = new Calculator();
		
		c.add(10, 20);
		c.add(12.24, 33.77);
	}

}
