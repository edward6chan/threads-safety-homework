public class Withdrawal extends Transaction {

	double withdrawalAmount;

	//Constructors
	public Withdrawal (Account acc) {
		super(acc);
	}
	public Withdrawal (Account acc, double amount) {
		super(acc);
		withdrawalAmount = amount;
	}

	public void makeTransaction(){
		if ((this.getAccountBalance()-withdrawalAmount) < 0) {
			System.out.println("There are insufficient funds to complete this transaction - transaction voided.");
		}
		else {
			this.setAccountBalance(this.getAccountBalance() - withdrawalAmount);
		}
	}
	/** new contstructors, don't need these methods
	public void makeTransaction(double amount){
		if ((this.getAccountBalance()-amount) < 0) {
			System.out.println("There are insufficient funds to complete this transaction - transaction voided.");
		}
		else {
			this.setAccountBalance(this.getAccountBalance() - amount);
		}
	}
	public void makeTransaction(Account fromAccount, Account toAccount, double amount){}
	**/

	public void run() {
		System.out.println("Account number: " + this.getAccountNumber() + " Withdrawing: $" + withdrawalAmount + "...");
		this.makeTransaction();
	}
}