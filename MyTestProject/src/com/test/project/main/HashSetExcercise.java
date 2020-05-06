package com.test.project.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExcercise {

	public static void main(String[] args) {

		HashSetExcercise hashSet = new HashSetExcercise();

		hashSet.HashSetFirst();
		hashSet.HashSetSecond();
		hashSet.HashSetThird();
		hashSet.HashSetFourth();
		hashSet.HashSetFifth();
		hashSet.HashSetSix();
		hashSet.HashSetSeven();
		hashSet.HashSetEight();
		hashSet.HashSetNine();
		hashSet.HashSetTenth();
		hashSet.HashSetEleven();
		hashSet.HashSetTwelve();
	}

	// 1. Write a Java program to append the specified element to the end of a hash
	// set.

	public void HashSetFirst() {
		System.out.println("TASK NUMBER:01");
		System.out.println("\n");

		HashSet<String> Set1 = new HashSet<String>();

		Set1.add("One");
		Set1.add("Two");
		Set1.add("Three");
		Set1.add("four");
		Set1.add("Five");

		System.out.println("The lsit is: \n " + Set1);
		System.out.println("\n");
		System.out.println("TASK NUMBER:02");
		System.out.println("\n");

	}

	// 2. Write a Java program to iterate through all elements in a hash list.

	public void HashSetSecond() {

		HashSet<String> Set2 = new HashSet<String>();
		Set2.add("Red");
		Set2.add("Purple");
		Set2.add("Orange");
		Set2.add("Green");
		Set2.add("Black");
		for (String set2 : Set2) {
			System.out.println(set2);
		}
		System.out.println("\n");
		System.out.println("TASK NUMBER:03");
		System.out.println("\n");
	}

	// 3. Write a Java program to get the number of elements in a hash set.

	public void HashSetThird() {

		HashSet<Integer> Set3 = new HashSet<Integer>();

		Set3.add(5);
		Set3.add(1);
		Set3.add(4);
		Set3.add(3);
		Set3.add(2);
		System.out.println("The set is: \n " + Set3);
		System.out.println("Size of the set is:  " + Set3.size());
		System.out.println("\n");
		System.out.println("TASK NUMBER:04");
		System.out.println("\n");

	}

	// 4. Write a Java program to empty an hash set.

	public void HashSetFourth() {

		HashSet<String> Set4 = new HashSet<String>();
		Set4.add("Red");
		Set4.add("Purple");
		Set4.add("Orange");
		Set4.add("Green");
		Set4.add("Black");
		System.out.println("The set is full: \n " + Set4);
		Set4.removeAll(Set4);
		System.out.println("Now the set is empty: \n " + Set4);
		System.out.println("\n");
		System.out.println("TASK NUMBER:05");
		System.out.println("\n");

	}

	// 5. Write a Java program to test a hash set is empty or not.

	public void HashSetFifth() {

		HashSet<Integer> Set5 = new HashSet<Integer>();

		Set5.add(5);
		Set5.add(1);
		Set5.add(4);
		Set5.add(3);
		Set5.add(2);
		System.out.println("The set has following elements: \n " + Set5);
		System.out.println("Is the set is empty?:  " + Set5.isEmpty());

		System.out.println("\n");
		System.out.println("TASK NUMBER:06");
		System.out.println("\n");

	}

	// 6. Write a Java program to clone a hash set to another hash set.

	public void HashSetSix() {

		HashSet<Integer> Set6 = new HashSet<Integer>();

		Set6.add(5);
		Set6.add(1);
		Set6.add(4);
		Set6.add(3);
		Set6.add(2);
		System.out.println("The hashset has following elements: \n " + Set6);

		HashSet<Integer> Set6A = new HashSet<Integer>(Set6);

		System.out.println("The Cloneset elements are: \n " + Set6);
		System.out.println("\n");
		System.out.println("TASK NUMBER:07");
		System.out.println("\n");

	}

	// 7. Write a Java program to convert a hash set to an array.

	public void HashSetSeven() {

		HashSet<String> Set7 = new HashSet<String>();
		Set7.add("Red");
		Set7.add("Purple");
		Set7.add("Orange");
		Set7.add("Green");
		Set7.add("Black");

		System.out.println("The set has following elements: \n " + Set7);
		String[] array = new String[Set7.size()];
		Set7.toArray(array);

		System.out.println("The set has following elements: \n");
		for (String set : Set7) {
			System.out.println(set);
		}
		System.out.println("\n");
		System.out.println("TASK NUMBER:08");
		System.out.println("\n");

	}

	// 8. Write a Java program to convert a hash set to a tree set.

	public void HashSetEight() {

		HashSet<Integer> Set8 = new HashSet<Integer>();

		Set8.add(5);
		Set8.add(1);
		Set8.add(4);
		Set8.add(3);
		Set8.add(2);
		System.out.println("The hashset has following elements: \n " + Set8);

		TreeSet<Integer> treeSet = new TreeSet<Integer>(Set8);

		System.out.println("The Treeset has following elements: \n " + Set8);
		System.out.println("\n");
		System.out.println("TASK NUMBER:09");
		System.out.println("\n");

	}

	// 9. Write a Java program to convert a hash set to a List/ArrayList.

	public void HashSetNine() {

		HashSet<String> Set9 = new HashSet<String>();
		Set9.add("Red");
		Set9.add("Purple");
		Set9.add("Orange");
		Set9.add("Green");
		Set9.add("Black");

		System.out.println("The hashset has following elements: \n " + Set9);

		ArrayList<String> arrayList = new ArrayList<String>(Set9);

		System.out.println("The arraylist have following elements: \n " + Set9);
		System.out.println("\n");
		System.out.println("TASK NUMBER:10");
		System.out.println("\n");
	}

	// 10. Write a Java program to compare two hash set.

	public void HashSetTenth() {

		HashSet<String> Set10 = new HashSet<String>();
		Set10.add("Red");
		Set10.add("Purple");
		Set10.add("Orange");
		Set10.add("Green");
		Set10.add("Black");

		HashSet<String> Set10A = new HashSet<String>();
		Set10A.add("Red");
		Set10A.add("Pink");
		Set10A.add("Orange");
		Set10A.add("Blue");
		Set10A.add("Black");

		for (String values : Set10) {
			System.out.println(Set10A.contains(values));

		}
		System.out.println("\n");
		System.out.println("TASK NUMBER:11");
		System.out.println("\n");

	}

	// 11. Write a Java program to compare two sets and retain elements which are
	// same on both sets.

	public void HashSetEleven() {

		HashSet<Integer> Set11 = new HashSet<Integer>();

		Set11.add(5);
		Set11.add(1);
		Set11.add(4);
		Set11.add(3);
		Set11.add(2);
		System.out.println("The first hashset has following elements: \n " + Set11);

		HashSet<Integer> Set11A = new HashSet<Integer>();

		Set11A.add(6);
		Set11A.add(9);
		Set11A.add(5);
		Set11A.add(7);
		Set11A.add(2);
		System.out.println("The second hashset has following elements: \n " + Set11A);
		Set11.retainAll(Set11A);
		System.out.println("Following are the similar elements in both hashsets: \n " + Set11);
		System.out.println("\n");
		System.out.println("TASK NUMBER:12");
		System.out.println("\n");

	}

	// 12. Write a Java program to remove all of the elements from a hash set.

	public void HashSetTwelve() {

		HashSet<String> Set12 = new HashSet<String>();
		Set12.add("Red");
		Set12.add("Purple");
		Set12.add("Orange");
		Set12.add("Green");
		Set12.add("Black");
		System.out.println("The set is full: \n " + Set12);
		System.out.println("Remove all the elements from set");
		Set12.removeAll(Set12);
		System.out.println("Now the set is empty: \n " + Set12);
	}

}
