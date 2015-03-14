public class Deposit extends Transaction {
	public Deposit (Account acc) {
		super(acc);
	}

	public void makeTransaction(){}

	public void makeTransaction(double amount){
		this.setAccountBalance(this.getAccountBalance() + amount);
	}

	public void makeTransaction(Account fromAccount, Account toAccount, double amount){}
}