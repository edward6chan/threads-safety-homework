public class Account {

	protected int accountNumber;
	protected double accountBalance;

	public Account(int n, double balance) {
		accountNumber = n;
		accountBalance = balance;
	}

	public int getAccountNumber() {
	    return accountNumber;
	}
  
  	public double getAccountBalance() {
		return accountBalance;
	}
  
	public void makeDeposit(double amount) {
		accountBalance += amount;
	}
  
 	 public int makeWithdrawal(double amount) {
    	int isValid = 1;
		if ( (accountBalance-amount) < 0 ) {
		  System.out.println("There are insufficient funds to complete this transaction - transaction voided.");
		  isValid = 1;
		}
		else {
		  accountBalance -= amount;
		  isValid = 0;
		}
	
		return isValid;
  	}

}