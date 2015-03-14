public class Transfer extends Transaction {
	public Transfer (Account acc) {
		super(acc);
	}

	public void makeTransaction(){}

	public void makeTransaction(double amount){}

	public void makeTransaction(Account fromAccount, Account toAccount, double amount){
		double fromAccountBalance = fromAccount.getAccountBalance();
		double toAccountBalance = toAccount.getAccountBalance();
		  
	    if ((fromAccountBalance - amount) > 0) {
		  fromAccount.setAccountBalance(fromAccountBalance - amount);
		  toAccount.setAccountBalance(toAccountBalance + amount);
		}
		else {
		  System.out.println("Insufficient amount of funds to transfer. Transaction voided.");
		}
	}
}