package lab6;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Exercise1 {
	public static void main(String arg[]) {
		HashMap<Integer, Integer> sc = new HashMap<>();
		sc.put(1, 10);
		sc.put(6, 60);
		sc.put(3, 30);
		sc.put(4, 40);
		sc.put(5, 50);
		Map<Integer, Integer> sh = getvalues(sc);

		Set<Map.Entry<Integer, Integer>> set = sh.entrySet();
		Iterator<Map.Entry<Integer, Integer>> i = set.iterator();

		while (i.hasNext()) {
			Map.Entry<Integer, Integer> entry = i.next();
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " " + value);
		}

	}

	public static HashMap<Integer, Integer> getvalues(HashMap<Integer, Integer> sc) {
		
		
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(sc.entrySet());
		
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			
			
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		
		
		HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

}
