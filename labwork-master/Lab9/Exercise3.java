package Lab9;

import java.util.Scanner;
import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		UserValidation obj=(username,password)->{
			if(username.equals("admin") &&
					password.equals("a123")) {
				return true;
			}
			return false;
		};
		
		System.out.println("Enter username and password:");
		String uname=sc.nextLine();
		String pass=sc.nextLine();
		sc.close();
		System.out.println(obj.validate(uname, pass));
	}
	

}
interface UserValidation{
	boolean validate(String a,String b );

	
}
