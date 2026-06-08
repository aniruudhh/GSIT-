package InterfaceImplementation;

public class CreditCard implements Payment{
	
	public void makePayment() {
		System.out.println("Credit Card payment");
		
	}
	
	public static void main(String[] args) {
		Payment p1 = new CreditCard();
		p1.makePayment();
		
		Payment p2 = new UPI();
		p2.makePayment();
	}
	

}
