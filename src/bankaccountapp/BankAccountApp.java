package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List <Account> accounts = new LinkedList<Account>();
		
		/*
		Checking chkacc1 = new Checking("Lutfi Setioningtias","234567", 1500);
		Savings savacc1 = new Savings("Bill Beck","123456", 2500);
		// savacc1.compound();
		savacc1.showInfo();		
		System.out.println("************");
		chkacc1.showInfo();
//		savacc1.deposit(5000);
//		savacc1.withdraw(200);
//		savacc1.transfer("Jambi", 3000);
		*/
		
		// read a CSV file then create new account bases on that data
		String file = "D:\\BELAJAR JAVA\\GITHUBupload\\MyJavaProjectLutfiSetioningtias\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders ) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
			if (accountType.equals("Savings")) {
//				System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name,sSN,initDeposit));
			}
			else if (accountType.equals("Checking")) {
//				System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name,sSN,initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
//			System.out.println(accountHolder[0]);
//			System.out.println(accountHolder[1]);
//			System.out.println(accountHolder[2]);
//			System.out.println(accountHolder[3]);
		}
//		accounts.get(5).showInfo();
		for (Account acc : accounts) {
			System.out.println("\n********************");
			acc.showInfo();
		}
		accounts.get((int) Math.random() * accounts.size()).deposit(10000);
		accounts.get((int) Math.random() * accounts.size()).deposit(1500);
	}

}
