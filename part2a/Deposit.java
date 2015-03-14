public class Deposit extends Transaction {
	
	double depositAmount;

	//Constructors
	public Deposit (Account acc) {
		super(acc);
	}
	public Deposit (Account acc, double amount) {
		super(acc);
		depositAmount = amount;
	}

	public void makeTransaction(){
		this.setAccountBalance(this.getAccountBalance() + depositAmount);
	}
	//public void makeTransaction(double amount){
	//	this.setAccountBalance(this.getAccountBalance() + amount);
	//}
	//public void makeTransaction(Account fromAccount, Account toAccount, double amount){}

	public void run() {
		System.out.println("Account number: " + this.getAccountNumber() + " Depositing: $" + depositAmount + "...");
		this.makeTransaction();
	}


	//so I don't even need three transaction methods noww that i am passing all the parameters through constructors.
}