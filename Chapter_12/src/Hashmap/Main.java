package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Aditya");
		map.put(2, "Aakash");
		map.put(3, "Anant");
		map.put(4, "Chaman");
		map.put(5, "Raman");

		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());

		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) iterator.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());

		}

	}
}
