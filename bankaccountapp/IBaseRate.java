package bankaccountapp;

public interface IBaseRate {
	//write a methods that return the base rate
	default double getBaseRate() {
		return 2.5;
		
	}
	
}
