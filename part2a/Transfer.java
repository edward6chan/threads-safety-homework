public class Transfer extends Transaction {

	double transferAmount;
	Account fromAccount;
	Account toAccount;

	//Contstructors
	public Transfer (Account acc) {
		super(acc);
	}
	public Transfer (Account acc, Account from, Account to, double amount) {
		super(acc);
		fromAccount = from;
		toAccount = to;
		transferAmount = amount;
	}

	public void makeTransaction(){
		double fromAccountBalance = fromAccount.getAccountBalance();
		double toAccountBalance = toAccount.getAccountBalance();
		  
	    if ((fromAccountBalance - transferAmount) > 0) {
		  fromAccount.setAccountBalance(fromAccountBalance - transferAmount);
		  toAccount.setAccountBalance(toAccountBalance + transferAmount);
		}
		else {
		  System.out.println("Insufficient amount of funds to transfer. Transaction voided.");
		}
	}

	public void run() {
		System.out.println("Transfering: $" + transferAmount + " from Account: " + fromAccount.getAccountNumber() + " to Account: " + toAccount.getAccountNumber() + "...");
		this.makeTransaction();
	}

	/** commenting these methods out because of new constructors

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

	**/
}