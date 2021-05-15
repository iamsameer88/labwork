package lab4;

public class Savingaccount extends Account {
	   
	public Savingaccount(long accnum, double balance, String accholder) {
		super(accnum, balance, accholder);
		// TODO Auto-generated constructor stub
	}
	double minimumBalance=500;
	void withdraw(double c) {
		if(balance>minimumBalance) {
			balance=balance-c;
			System.out.println("allow withdraw");
		}
		else {
			System.out.println("withdraw not allow");
		}
	}
}
