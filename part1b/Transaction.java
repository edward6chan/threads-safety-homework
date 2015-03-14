public abstract class Transaction {
	protected Account account;

	public Transaction (Account acc) {
		account = acc;
	}

	//Getters
	public int getAccountNumber() {
		return account.getAccountNumber();
	}
  	public double getAccountBalance() {
  		return account.getAccountBalance();
  	}

  	//Setters
	public void setAccountNumber(int n) {
		account.setAccountNumber(n);
	}
  	public void setAccountBalance(double balance) {
  		account.setAccountBalance(balance);
  	}
  	
  	public abstract void makeTransaction();
	public abstract void makeTransaction(double amount);
	public abstract void makeTransaction(Account fromAccount, Account toAccount, double amount);
}