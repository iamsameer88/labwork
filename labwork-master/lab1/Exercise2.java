package lab1;

import java.util.Arrays;

//import javax.print.attribute.standard.MediaSize.NA;

public class Exercise2 {
	public static void main(String args[]) {
		String s[] = new String[] { "shubhashishvarshneyl" };
		SortString(s);

	}

	public static void SortString(String a[]) {
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		}
		int n = (int)a.length;
		if (n % 2 == 0) {
			for (int i = 0; i < n / 2; i++) {
				String s =a[i];
				System.out.println(s);
			}
			for (int i = n / 2; i < n; i++) {
				String h= a[i];
				System.out.println(h);
			}
		} else {
			for (int i = 0; i < n / 2+1; i++) {
			  if(i==n/2 +1) {
				  System.out.println(a[i].toLowerCase());
			  }
			  else {
				  System.out.println(a[i].toUpperCase());
			  }
		}
	}
}
}

