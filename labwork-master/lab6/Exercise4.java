package lab6;

import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> sc = new HashMap<>();
		sc.put(1, 76);
		sc.put(6, 80);
		sc.put(3, 90);
		sc.put(4, 86);
		sc.put(5, 70);
		Map<Integer, String> sh = getvalues(sc);
		System.out.println(sh);

	}

	public static HashMap<Integer, String> getvalues(HashMap<Integer, Integer> sc) {
		HashMap<Integer, String> g = new HashMap<>();
		Set<Map.Entry<Integer, Integer>> set = sc.entrySet();
		Iterator<Map.Entry<Integer, Integer>> i = set.iterator();

		while (i.hasNext()) {
			Map.Entry<Integer, Integer> entry = i.next();
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			if (value >= 70 && value < 80) {
				g.put(key, "bronze");
			} else if (value >= 80 && value < 90) {
				g.put(key, "silver");
			} else if (value >= 90) {
				g.put(key, "gold");
			}
		}
		return g;
	}
}
