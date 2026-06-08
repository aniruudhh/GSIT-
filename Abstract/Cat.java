package Abstract;

public class Cat extends Animal{
	public void sound() {
		System.out.println("Cat meows");
	}
	
	public static void main (String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		c.sound();
		d.sound();
		
	}

}
