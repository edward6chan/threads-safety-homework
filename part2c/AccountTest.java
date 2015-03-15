public class AccountTest {
  public static double[] main (String[] args) {

  	System.out.println("Creating bank accounts...");
  	
    Account[] account = new Account[5];
	
	account[0] = new Account(1, Double.parseDouble(args[0]));
	account[1] = new Account(2, Double.parseDouble(args[1]));
	account[2] = new Account(3, Double.parseDouble(args[2]));
	account[3] = new Account(4, Double.parseDouble(args[3]));
	account[4] = new Account(5, Double.parseDouble(args[4]));

	System.out.println("Creating threads...");
	Thread[] transacton = new Transaction[15];

	//Account 1
	transacton[0] = new Deposit(account[0], 350);
	transacton[1] = new Withdrawal(account[0], 200);
	transacton[2] = new Transfer(account[0], account[0],account[1], 100.0);

	//Account 2
	transacton[3] = new Deposit(account[1], 200);
	transacton[4] = new Withdrawal(account[1], 150);
	transacton[5] = new Transfer(account[1], account[1],account[2], 200.0);

	//Account 3
	transacton[6] = new Deposit(account[2], 100);
	transacton[7] = new Withdrawal(account[2], 150);
	transacton[8] = new Transfer(account[2], account[2],account[3], 200.0);

	//Account 4
	transacton[9] = new Deposit(account[3], 100);
	transacton[10] = new Withdrawal(account[3], 200);
	transacton[11] = new Transfer(account[3], account[3],account[4], 300.0);

	//Account 5
	transacton[12] = new Deposit(account[4], 100);
	transacton[13] = new Withdrawal(account[4], 150);
	transacton[14] = new Transfer(account[4], account[4],account[0], 200.0);

	for (int i=0; i<transacton.length;i++) {
		transacton[i].start();
	}

	//Thread.yield();

	//for (int i=0; i<transacton.length;i++) {
	//	transacton[i].run();
	//}


	double[] finalBalances = { account[0].getAccountBalance(), account[1].getAccountBalance(), 
		account[2].getAccountBalance(), account[3].getAccountBalance(), 
		account[4].getAccountBalance() };
    return finalBalances;
  }
  
  
}