
package com.test.project.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapExcercise {

	public static void main(String[] args) {

		HashmapExcercise hashMap = new HashmapExcercise();

		hashMap.hashMapFirst();
		hashMap.hashMapSecond();
		hashMap.hashMapThird();
		hashMap.hashMapFourth();
		hashMap.hashMapFifth();
		hashMap.hashMapSeventh();
		hashMap.hashMapEight();
		hashMap.hashMapNinth();
		hashMap.hashMapTenth();
		hashMap.hashMapEleventh();
		hashMap.hashMapTwelveth();

	}

	// 1. Write a Java program to associate the specified value with the specified
	// key in a HashMap.

	public void hashMapFirst() {

		System.out.println("TASK NUMBER:01");
		System.out.println("\n");

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "pencil");
		map.put(2, "rubber");
		map.put(3, "scale");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}

		System.out.println("\n");
		System.out.println("TASK NUMBER:02");
		System.out.println("\n");

	}

	// 2. Write a Java program to count the number of key-value (size) mappings in a
	// map.

	public void hashMapSecond() {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "pencil");
		map.put(2, "rubber");
		map.put(3, "scale");

		System.out.println("Size of the hashmap: \n " + map.size());

		System.out.println("\n");
		System.out.println("TASK NUMBER:03");
		System.out.println("\n");

	}

	// 3. Write a Java program to copy all of the mappings from the specified map to
	// another map.

	public void hashMapThird() {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "pencil");
		map.put(2, "rubber");
		map.put(3, "scale");
		System.out.println("The vales of map one is: \n" + map);
		System.out.println("\n");

		HashMap<Integer, String> map1 = new HashMap<>();

		map1.put(4, "coil");
		map1.put(5, "switch");
		map1.put(6, "cable");

		System.out.println("The values of map two is: \n" + map1);
		System.out.println("\n");
		map1.putAll(map);
		System.out.println("Now the values of map two is: \n" + map1);
		System.out.println("\n");

		System.out.println("\n");
		System.out.println("TASK NUMBER:04");
		System.out.println("\n");

	}

	// 4. Write a Java program to remove all of the mappings from a map.

	public void hashMapFourth() {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "pencil");
		map.put(2, "rubber");
		map.put(3, "scale");

		System.out.println("The vales of map is: \n" + map);
		map.clear();
		System.out.println("The vales of map two is now: \n" + map);
		System.out.println("\n");
		System.out.println("TASK NUMBER:05");
		System.out.println("\n");

	}

	// 5. Write a Java program to check whether a map contains key-value mappings
	// (empty) or not.

	public void hashMapFifth() {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "pencil");
		map.put(2, "rubber");
		map.put(3, "scale");
		boolean answer = map.isEmpty();
		System.out.println("Is map is empty or not? \n" + answer);
		map.clear();
		answer = map.isEmpty();
		System.out.println("Is map is empty or not? \n" + answer);
		System.out.println("\n");
		System.out.println("TASK NUMBER:06");
		System.out.println("\n");

	}

	// 6. Write a Java program to get a shallow copy of a HashMap instance.

	public void hashMapsixth() {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "pencil");
		map.put(2, "rubber");
		map.put(3, "scale");

		System.out.println("The values of map are: \n " + map);

		HashMap<Integer, String> map1 = new HashMap<>(map);

		System.out.println("The values of shallow map are: \n " + map);

		System.out.println("\n");
		System.out.println("TASK NUMBER:07");
		System.out.println("\n");

	}

	// 7. Write a Java program to test if a map contains a mapping for the specified
	// key.

	public void hashMapSeventh() {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "pencil");
		map.put(2, "rubber");
		map.put(3, "scale");

		System.out.println("The values of map are: \n " + map);

		System.out.println("Is key '3' is exist?  ");
		if (map.containsKey(3)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");

		}
		System.out.println("\n");
		System.out.println("TASK NUMBER:08");
		System.out.println("\n");
	}

	// 8. Write a Java program to test if a map contains a mapping for the specified
	// value.

	public void hashMapEight() {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "pencil");
		map.put(2, "rubber");
		map.put(3, "scale");

		System.out.println("The values of map are: \n " + map);

		System.out.println("Is key 'rubber' is exist?  ");
		if (map.containsValue("rubber")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");

		}
		System.out.println("\n");
		System.out.println("TASK NUMBER:09");
		System.out.println("\n");
	}

	// 9. Write a Java program to create a set view of the mappings contained in a
	// map.

	public void hashMapNinth() {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "pencil");
		map.put(2, "rubber");
		map.put(3, "scale");

		System.out.println("The values of map are: \n " + map);
		Set set = map.entrySet();
		System.out.println("The values of set are: \n " + set);

		System.out.println("\n");
		System.out.println("TASK NUMBER:10");
		System.out.println("\n");
	}

	// 10. Write a Java program to get the value of a specified key in a map.

	public void hashMapTenth() {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "pencil");
		map.put(2, "rubber");
		map.put(3, "scale");

		System.out.println("The values of map are: \n " + map);
		String value = map.get(3);
		System.out.println("The value of key three is: \n " + value);
		System.out.println("\n");
		System.out.println("TASK NUMBER:11");
		System.out.println("\n");
	}

	// 11. Write a Java program to get a set view of the keys contained in this map.

	public void hashMapEleventh() {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "pencil");
		map.put(2, "rubber");
		map.put(3, "scale");

		System.out.println("The values of map are: \n " + map);

		Set set = map.keySet();
		System.out.println("The values of set are: \n " + set);
		System.out.println("\n");
		System.out.println("TASK NUMBER:12");
		System.out.println("\n");
	}

	// 12. Write a Java program to get a collection view of the values contained in
	// this map.

	public void hashMapTwelveth() {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "pencil");
		map.put(2, "rubber");
		map.put(3, "scale");

		System.out.println("The values of map are: \n " + map);
		System.out.println("The values of set are: \n " + map.values());
	}
}
