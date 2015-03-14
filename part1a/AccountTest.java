public class AccountTest {
  public static double[] main (String[] args) {
    Account[] account = new Account[5];
	
	account[0] = new Account(1, Double.parseDouble(args[0]));
	account[1] = new Account(2, Double.parseDouble(args[1]));
	account[2] = new Account(3, Double.parseDouble(args[2]));
	account[3] = new Account(4, Double.parseDouble(args[3]));
	account[4] = new Account(5, Double.parseDouble(args[4]));
	
	/*
	//InitialBalance
	System.out.println();
	System.out.print( "Account " + account[0].getAccountNumber() + ":");
	System.out.println( "  Initial Balance: " + account[0].getAccountBalance());
	System.out.println();
	System.out.print( "Account " + account[1].getAccountNumber() + ":");
	System.out.println( "  Initial Balance: " + account[1].getAccountBalance());
	System.out.println();
	System.out.print( "Account " + account[2].getAccountNumber() + ":");
	System.out.println( "  Initial Balance: " + account[2].getAccountBalance());
	System.out.println();
	System.out.print( "Account " + account[3].getAccountNumber() + ":");
	System.out.println( "  Initial Balance: " + account[3].getAccountBalance());
	System.out.println();
	System.out.print( "Account " + account[4].getAccountNumber() + ":");
	System.out.println( "  Initial Balance: " + account[4].getAccountBalance());
	System.out.println();
	//makeDeposit
	account[0].makeDeposit(350.0);
	account[1].makeDeposit(200.0);
	account[2].makeDeposit(100.0);
	account[3].makeDeposit(100.0);
	account[4].makeDeposit(100.0);
	
	//makeWithdrawal
	account[0].makeWithdrawal(200.0);
	account[1].makeWithdrawal(150.0);
	account[2].makeWithdrawal(150.0);
	account[3].makeWithdrawal(200.0);
	account[4].makeWithdrawal(150.0);
	
	//makeTransfer
	makeTransfer(account[0],account[1], 100.0);
	makeTransfer(account[1],account[2], 200.0);
	makeTransfer(account[2],account[3], 200.0);
	makeTransfer(account[3],account[4], 300.0);
	makeTransfer(account[4],account[0], 200.0);
	
	double[] finalBalances = new double[]{ account[0].getAccountBalance(), account[1].getAccountBalance(), account[2].getAccountBalance(), account[3].getAccountBalance(), account[4].getAccountBalance()};
	*/

	//makeDeposit
	account[0].makeDeposit(350.0);
	account[1].makeDeposit(200.0);
	account[2].makeDeposit(100.0);
	account[3].makeDeposit(100.0);
	account[4].makeDeposit(100.0);

	//makeWithdrawal
	account[0].makeWithdrawal(200.0);
	account[1].makeWithdrawal(150.0);
	account[2].makeWithdrawal(150.0);
	account[3].makeWithdrawal(200.0);
	account[4].makeWithdrawal(150.0);

	//makeTransfer
	makeTransfer(account[0],account[1], 100.0);
	makeTransfer(account[1],account[2], 200.0);
	makeTransfer(account[2],account[3], 200.0);
	makeTransfer(account[3],account[4], 300.0);
	makeTransfer(account[4],account[0], 200.0);



	double[] finalBalances = { account[0].getAccountBalance(), account[1].getAccountBalance(), 
		account[2].getAccountBalance(), account[3].getAccountBalance(), 
		account[4].getAccountBalance() };
    return finalBalances;
  }
  
  public static void makeTransfer(Account fromAccount, Account toAccount, double amount) {
	double fromAccountBalance = fromAccount.getAccountBalance();
	double toAccountBalance = toAccount.getAccountBalance();
	  
    if ((fromAccountBalance - amount) > 0) {
	  //fromAccountBalance -= amount;
	  //toAccountBalance += amount;
	  fromAccount.makeWithdrawal(amount);
	  toAccount.makeDeposit(amount);
	}
	else {
	  System.out.println("Insufficient amount of funds to transfer.");
	}
  }
  
}