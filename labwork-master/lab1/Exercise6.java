package lab1;
import java.util.Scanner;

public class Exercise6 
{
	void prime(int n)
	{
		int count=0;
		for(int j=1;j<=n;j++)
		{
			if(n%j==0)
				count++;
		}
		if(count==2)
			System.out.print(n+" ");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Exercise6 ex=new Exercise6();
		for(int i=1;i<=num;i++)
		{
			ex.prime(i);
		}
		sc.close();
	}
}
