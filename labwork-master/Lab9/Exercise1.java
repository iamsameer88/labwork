package Lab9;

import java.util.Scanner;
import java.lang.Math;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		powerof f=(x,y)->{
			double g=Math.pow(x, y);
			return g;
		};
		
		System.out.println("Enter the value of x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(f.pow(x, y));
		

	}

}
@FunctionalInterface
interface powerof{
	double pow(int x,int y);
}