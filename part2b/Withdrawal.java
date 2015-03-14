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

		synchronized(this) 
		{

			
			try{
				Thread.sleep(4000);
	        }catch(InterruptedException e){}

			if ((this.getAccountBalance()-withdrawalAmount) < 0) {
				System.out.println("There are insufficient funds to complete this transaction - transaction voided.");
			}
			else {
				this.setAccountBalance(this.getAccountBalance() - withdrawalAmount);
			}


		}
	}

	public void run() {
		System.out.println("Account number: " + this.getAccountNumber() + " Withdrawing: $" + withdrawalAmount + "...");
		this.makeTransaction();
	}
}