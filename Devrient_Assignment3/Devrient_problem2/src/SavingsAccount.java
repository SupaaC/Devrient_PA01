


/*
 * Calculating interest rate
 * want to store annualInterestRate for each customer
 * create separate objects for two savers (saver1 & savaer2)
 * each object has savingsBalance
 * calculateMonthly interest gained and update total in account
 * interest rate hasto be set manually
 */
public class SavingsAccount {
	
	private static double annualInterestRate; 
	private double savingsBalance;
	
	public SavingsAccount() {
		
	}
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	public void calculateMonthlyInterest () {
		double monthlyInterest;
	
		monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += monthlyInterest;

		
	}

	public static void modifyInterestRate (double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
	
		
}
