package MethodOverloading;

public class LoanCalculator {
	
	public void calculateLoan(int amount) {
		System.out.println("Total loan amount pending: " + amount);
		
	}
	
	public void calculateLoan(int amount, double interestRate) {
		System.out.println("Total interest rate of "+ interestRate +  " is penidng for loan amount " + amount);
	}
	
	public static void main (String[] args) {
		LoanCalculator lc = new LoanCalculator();
				lc.calculateLoan(100);
				lc.calculateLoan(100, 2.34);
	}

}
