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

		System.out.println("Transfering: $" + transferAmount + " from Account: " + fromAccount.getAccountNumber() + " to Account: " + toAccount.getAccountNumber() + "...");

		synchronized(fromAccount)
		{

			Thread.yield();

			synchronized(toAccount){

				double fromAccountBalance = fromAccount.getAccountBalance();
				double toAccountBalance = toAccount.getAccountBalance();

				//try{
					//Thread.sleep(4000);
		        //}catch(InterruptedException e){}
				  
			    if ((fromAccountBalance - transferAmount) > 0) {
				  fromAccount.setAccountBalance(fromAccountBalance - transferAmount);
				  toAccount.setAccountBalance(toAccountBalance + transferAmount);
				}
				else {
				  System.out.println("Insufficient amount of funds to transfer. Transaction voided.");
				}
			}

		}
	}

	public void run() {
		this.makeTransaction();
	}

}