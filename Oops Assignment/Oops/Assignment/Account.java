package Oops.Assignment;

public class Account {
	private String accountHolderName;
	private int balance;
	
	public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
	
	public void setBalance(int balance) {
		if (balance < 0) {
			System.out.println("Negative balance is not valid");
		} else {
			this.balance = balance;
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
	public static void main (String[ ] args) {
		Account a1 = new Account();
		a1.setBalance(1000);
		a1.setAccountHolderName("Anirudh");
		
		 System.out.println("Account Holder: " + a1.getAccountHolderName());
	     System.out.println("Balance: " + a1.getBalance());
	}

}
