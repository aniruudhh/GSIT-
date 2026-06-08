package Oops.Assignment;

public class Product {

	int productId;
	String productName;
	int price;
	
	Product(){
		System.out.println("Product Created");
	}
	Product(int productId, String productName,int price){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		
	}
	public void displayProduct() {
		System.out.println("Product ID: " + productId + "\nProduct Name: " + productName 
				+"\nPrice: " + price);
	}
	
	public static void main (String[] args) {
		Product p1 = new Product();
		Product p2 = new Product(1001,"Pomodoro", 200);
		
		p2.displayProduct();
	
	}
	
}
