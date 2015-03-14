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
		synchronized(this) 
		{		

			try{
				Thread.sleep(4000);
	        }catch(InterruptedException e){}

			this.setAccountBalance(this.getAccountBalance() + depositAmount);


		}
	}

	public void run() {
		System.out.println("Account number: " + this.getAccountNumber() + " Depositing: $" + depositAmount + "...");
		this.makeTransaction();
	}

}