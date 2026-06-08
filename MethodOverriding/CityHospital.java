package MethodOverriding;

public class CityHospital extends Hospital {
	
	public void emergencyService() {
		super.emergencyService();
		System.out.println("City Hospital emergency service");
	}
	
	public static void main (String [] args) {
		CityHospital h = new CityHospital();
		h.emergencyService();
	}

}
