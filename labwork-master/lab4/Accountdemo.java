package lab4;
import java.util.Random;
public class Accountdemo {

	public static void main(String[] args) {
	       long aNumber = 0;
	       aNumber = (int)((Math.random() * 9000000)+1000000);
	       long bNumber = 0;
	       bNumber = (int)((Math.random() * 9000000)+1000000);
	       Account accounts=new Account(aNumber,2000,"smith");
	       Account accounts1=new Account(bNumber,2000,"Kathy");
	       System.out.println(accounts.getAccnum()+" "+accounts.getBalance()+" "+accounts.getAccholder());
	       accounts.Deposite(2000);
	       System.out.println(accounts.getAccnum()+" "+accounts.getBalance()+" "+accounts.getAccholder());
	       accounts1.withdraw(2000);
	       accounts1.withdraw(2000);
	       System.out.println(accounts1.getAccnum()+" "+accounts1.getBalance()+" "+accounts1.getAccholder());
	}

}
