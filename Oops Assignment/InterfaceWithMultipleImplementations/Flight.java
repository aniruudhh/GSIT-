package InterfaceWithMultipleImplementations;

public class Flight implements Transport{
	
	public void booking() {
		System.out.println("Advance booking is avaibale for flights");
	}
	
	 public static void main(String[] args) {
	Transport f = new Flight();
	f.booking();
	
	Transport b = new Bus();
	b.booking();
	
	 }

}
