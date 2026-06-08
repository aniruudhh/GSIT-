package Polymorphism.runtime.upcasting;

public class DSLCamera extends Camera {
	
	public void capture() {
		String cam = "4k";
		System.out.println("DSLR camera can capture upto" + cam + " resolution");
	}
	
	public static void main (String[] args) {
		Camera d = new DSLCamera();
		Camera c = new Camera();
		d.capture();
		c.capture();
	}

}
