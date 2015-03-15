public class Account {

	protected int accountNumber;
	protected double accountBalance;

	public Account(int n, double balance) {
		accountNumber = n;
		accountBalance = balance;
	}

	
	//Getters
	public int getAccountNumber() {
	    return accountNumber;
	}
  	public double getAccountBalance() {
		return accountBalance;
	}

	//Setters
	public void setAccountNumber(int n) {
		accountNumber = n;
	}
	public void setAccountBalance(double balance) {
		accountBalance = balance;
	}

}