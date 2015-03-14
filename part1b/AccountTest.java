public class AccountTest {
  public static double[] main (String[] args) {

  	
    Account[] account = new Account[5];
	
	account[0] = new Account(1, Double.parseDouble(args[0]));
	account[1] = new Account(2, Double.parseDouble(args[1]));
	account[2] = new Account(3, Double.parseDouble(args[2]));
	account[3] = new Account(4, Double.parseDouble(args[3]));
	account[4] = new Account(5, Double.parseDouble(args[4]));
	
	/** commented out for Transactions as a heterogeneous array
	Deposit[] deposit = new Deposit[5];

	deposit[0] = new Deposit(account[0]);
	deposit[0] = new Deposit(account[1]);
	deposit[0] = new Deposit(account[2]);
	deposit[0] = new Deposit(account[3]);
	deposit[0] = new Deposit(account[4]);

	deposit[0].makeTransaction(100);

	** From part1a


	**/

	Transaction[] transacton = new Transaction[15];

	//Account 1
	transacton[0] = new Deposit(account[0]);
	transacton[1] = new Withdrawal(account[0]);
	transacton[2] = new Transfer(account[0]);

	//Account 2
	transacton[3] = new Deposit(account[1]);
	transacton[4] = new Withdrawal(account[1]);
	transacton[5] = new Transfer(account[1]);

	//Account 3
	transacton[6] = new Deposit(account[2]);
	transacton[7] = new Withdrawal(account[2]);
	transacton[8] = new Transfer(account[2]);

	//Account 4
	transacton[9] = new Deposit(account[3]);
	transacton[10] = new Withdrawal(account[3]);
	transacton[11] = new Transfer(account[3]);

	//Account 5
	transacton[12] = new Deposit(account[4]);
	transacton[13] = new Withdrawal(account[4]);
	transacton[14] = new Transfer(account[4]);

	transacton[0].makeTransaction(350); //Deposit
	transacton[1].makeTransaction(200); //Withraw
	transacton[2].makeTransaction(account[0],account[1], 100.0); //Transfer

	transacton[3].makeTransaction(200); //Deposit
	transacton[4].makeTransaction(150); //Withraw
	transacton[5].makeTransaction(account[1],account[2], 200.0); //Transfer

	transacton[6].makeTransaction(100); //Deposit
	transacton[7].makeTransaction(150); //Withraw
	transacton[8].makeTransaction(account[2],account[3], 200.0); //Transfer

	transacton[9].makeTransaction(100); //Deposit
	transacton[10].makeTransaction(200); //Withraw
	transacton[11].makeTransaction(account[3],account[4], 300.0); //Transfer

	transacton[12].makeTransaction(100); //Deposit
	transacton[13].makeTransaction(150); //Withraw
	transacton[14].makeTransaction(account[4],account[0], 200.0); //Transfer

	double[] finalBalances = { account[0].getAccountBalance(), account[1].getAccountBalance(), 
		account[2].getAccountBalance(), account[3].getAccountBalance(), 
		account[4].getAccountBalance() };
    return finalBalances;
  }
  
  
}