package lab6;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Exercise2 {

	public static void main(String[] args) {
 
		char[] arr= {'s','s','a','a','n','m','k'};
	    // HashMap<Integer,String> sc
	     countChars(arr);
	     
	     
        

	}
     
	public static void countChars(char[] arr){
		HashMap<Character,Integer> hash=new HashMap();
		int n=arr.length;
		//int m[]=new int[n];
		for(int i=0;i<n;i++) {
			
		     if(hash.containsKey(arr[i])){
		         hash.put(arr[i], hash.get(arr[i]) + 1);
		       }else{
		         // If new character put that character in the map
		         // with the value as 1
		         hash.put(arr[i], 1);
		       }
			}
		Set<Map.Entry<Character, Integer>> numSet = hash.entrySet();
		Iterator<Map.Entry<Character, Integer>> i=numSet.iterator(); 
		while (i.hasNext()) {
			Map.Entry<Character, Integer> entry = i.next();
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " " + value);
		}
		
	    System.out.println(hash);
	    
		 
	     
	     /*
		 * for(int i=0;i<n;i++) { System.out.println(arr[i]+" "+m[arr[i]]); }
		 */
	}
}