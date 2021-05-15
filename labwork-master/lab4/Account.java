package lab4;

public class Account {
 
long accnum;
 double balance;
 String accholder;



 

public Account(long accnum, double balance, String accholder) {
	super();
	this.accnum = accnum;
	this.balance = balance;
	this.accholder = accholder;
}
public long getAccnum() {
	return accnum;
}
public void setAccnum(long accnum) {
	this.accnum = accnum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getAccholder() {
	return accholder;
}
public void setAccholder(String accholder) {
	this.accholder = accholder;
}
void Deposite(double b) {
	balance=balance+b;
}


  void withdraw(double c) { balance=balance-c; }
 
double getbalance(){
	return balance;
}
}
