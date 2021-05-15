package lab6;

import java.util.*;
import java.util.Map.Entry;

public class Exercise6 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> sc = new HashMap<>();
		sc.put(1, 20);
		sc.put(6, 12);
		sc.put(3, 13);
		sc.put(4, 14);
		sc.put(5, 21);
		List<Integer> sh = getvalues(sc);
		System.out.println(sh);


	}
	public static List<Integer> getvalues(HashMap<Integer, Integer> sc) {
		List<Integer> g = new ArrayList<>();
		Set<Map.Entry<Integer,Integer>> set=sc.entrySet();
		Iterator<Map.Entry<Integer, Integer>>  i= set.iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, Integer> sh=i.next();
			Integer key=sh.getKey();
			Integer value=sh.getValue();
			if(value>18) {
				g.add(key);
			}
			
			}
		return g;
	}
	
	
}
