package lab4;

public class currentaccount extends Account {
	public currentaccount(long accnum, double balance, String accholder) {
		super(accnum, balance, accholder);
		// TODO Auto-generated constructor stub
	}
	int overdraftLimit=0;
	boolean withdraw() {
		if(overdraftLimit<2) {
			overdraftLimit++;
			return true;
		}
		return false;
	}
}
