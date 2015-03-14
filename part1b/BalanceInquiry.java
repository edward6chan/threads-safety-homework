public class BalanceInquiry extends Transaction {
	public BalanceInquiry (Account acc) {
		super(acc);
	}

	public void makeTransaction(){
		System.out.println("Your current balance is: " + this.getAccountBalance());
	}

	public void makeTransaction(double amount){}

	public void makeTransaction(Account fromAccount, Account toAccount, double amount){}
}