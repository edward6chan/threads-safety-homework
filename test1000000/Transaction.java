import java.lang.Thread;

public abstract class Transaction extends Thread {
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
	public abstract void run();
}