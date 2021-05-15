package lab6;
import java.util.*;
public class Exercise3 {
	public static void main(String[] args) {
	 int a[]={1,2,3,4,5};
	 
	 HashMap<Integer,Integer> g=getvalues(a);
	 System.out.println(g);
	}
	
	public static HashMap<Integer,Integer>  getvalues(int a[]){
		HashMap<Integer,Integer> sc= new HashMap<>();
		int n=a.length,s;
		for(int i=0;i<n;i++) {
			s=a[i]*a[i];
			sc.put(a[i], s);
			
		}
		return sc;
	}
}