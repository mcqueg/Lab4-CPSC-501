//********************************************************************
//Garrett McCue 	
//
//7/27/20
//
//CPSC-501-Lab4Ex2
//**********************************************************************
public class Account {

	// -----------------------------------------------------------------
	// creates new accounts with a constructor while keeping track of
	// total number of accounts. It then returns the total account number
	// -----------------------------------------------------------------
	private static int numAccounts = 0;
	private String accountNum;

	public static void main(String[] args) {

		Account obj;

		obj = new Account("account1");
		obj = new Account("account2");
		obj = new Account("account3");
		obj = new Account("account4");

		System.out.println("total number of accounts: " + getNumAccounts());

	}

	// constructor to create new account objects as well as increment
	// numAccounts to keep track of total account count.
	public Account(String accountNum) {
		this.accountNum = accountNum;
		numAccounts++;

	}

	// method to return the total number of accounts
	public static int getNumAccounts() {

		return numAccounts;
	}
}
