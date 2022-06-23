package bankaccountapp;

public class Checking extends Account{
	//list properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPIN; 
	
	//constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super (name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}	
	@Override
		public void setRate() {
			//System.out.println("Implement Rate for Checking");
			rate = getBaseRate() * .15; 
		}
		
		
//		System.out.println("ACCOUNT NUMBER : " + this.accountNumber);
//		System.out.println("NEW CHECKING ACCOUNT");

	
	
	// list any methods specific to the checking account
	private void setDebitCard () {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
//		System.out.println("CARD : " + this.debitCardNumber);
//		System.out.println("PIN : " + this.debitCardPIN);
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features" + 
				"\n Debit Card Number : " + debitCardNumber + 
				"\n Debit Card PIN : " + debitCardPIN );				
	}

}
