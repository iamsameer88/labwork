package lab2;
import java.util.Scanner;

class Smallest
{
	//works only for non duplicate elements
	int getSecondSmallestNonDupli(int a[])
	{
		int n=a.length;
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a[1];
	}	
	
	//works even with duplicate elements
	int getSecondSmallest(int a[])
	{
		int n=a.length;
		int temp;
		for(int i=0;i<n;i++) //sort the array
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int b[]=new int[n];
		b[0]=a[0];
		for(int i=1,j=1;i<n;i++) //remove duplicate elements
		{
			if(a[i]!=a[i-1])
			{
				b[j]=a[i];
				j++;
			}
		}
		return b[1];
	}	
}


public class Exercise1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements in an array");
		int n=sc.nextInt();
		if(n<2)
		{
			System.out.println("Enter atleast 2 non identical elements");
			System.exit(0);
		}
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Smallest s=new Smallest();
		int small=s.getSecondSmallest(arr);
		System.out.println("Second Smallest element is : "+small);
		sc.close();
	}
}