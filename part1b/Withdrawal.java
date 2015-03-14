public class Withdrawal extends Transaction {
	public Withdrawal (Account acc) {
		super(acc);
	}

	public void makeTransaction(){}

	public void makeTransaction(double amount){
		if ((this.getAccountBalance()-amount) < 0) {
			System.out.println("There are insufficient funds to complete this transaction - transaction voided.");
		}
		else {
			this.setAccountBalance(this.getAccountBalance() - amount);
		}
	}

	public void makeTransaction(Account fromAccount, Account toAccount, double amount){}
}