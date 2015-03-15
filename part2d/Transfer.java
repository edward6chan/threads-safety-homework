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

		System.out.println("Transfering: $" + transferAmount + " from Account: " + fromAccount.getAccountNumber() + " to Account: " + toAccount.getAccountNumber() + "...");

		Account first, second;

		if(fromAccount.getAccountNumber() < toAccount.getAccountNumber()) {
			first = fromAccount;
			second = toAccount;
		} else {
			first = toAccount;
			second = fromAccount;
		}

		synchronized(first)
		{
			
			if ((fromAccountBalance - transferAmount) > 0) {
				Transaction withdrawal = new Withdrawal(fromAccount,transferAmount);
				withdrawal.start();
			}

			Thread.yield();

			synchronized(second){

				//try{
					//Thread.sleep(4000);
		        //}catch(InterruptedException e){}
				  
			    if ((fromAccountBalance - transferAmount) > 0) {
			    	Transaction deposit = new Deposit(toAccount,transferAmount);
					deposit.start();
				  //fromAccount.setAccountBalance(fromAccountBalance - transferAmount);
				  //toAccount.setAccountBalance(toAccountBalance + transferAmount);
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