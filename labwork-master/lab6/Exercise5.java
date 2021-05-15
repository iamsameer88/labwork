package lab6;
import java.util.*;
public class Exercise5 {

	public static void main(String[] args) {
		int a[]= {1,3,2,4,5,6};
		ArrayList courses = new ArrayList();
		int n=a.length;
		for(int i=0;i<n;i++) {
			courses.add(a[i]);
		}
		Collections.sort(courses);
		Iterator j = courses.iterator();
		while (j.hasNext()) {
			
			int ef = (int) j.next();
			if(ef==n-1) {
			System.out.println(ef);}
		}
		}
	}
