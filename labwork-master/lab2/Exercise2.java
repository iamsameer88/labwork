package lab2;
import java.util.*;

class StringOrder
{
	String[] sortStrings(String arr[])
	{
		int len=arr.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int mid;
		if(len%2==0)
			mid=len/2;
		else
			mid=(len/2)+1;
		for(int i=0;i<mid;i++)
		{
			arr[i]=arr[i].toUpperCase();
		}
		for(int i=mid;i<len;i++)
		{
			arr[i]=arr[i].toLowerCase();
		}
		return arr;
	}
}
public class Exercise2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements in an array");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		StringOrder str=new StringOrder();
		String res[]=new String[n];
		res=str.sortStrings(arr);
		System.out.println("Array after sorting is : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(res[i]+" ");
		}
		sc.close();
	}

}

