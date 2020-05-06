package com.test.project.main;

import java.util.*;

public class LinkedListMain {

	public static void main(String[] args) {

		LinkedListMain linkedListMain = new LinkedListMain();

		linkedListMain.linkedListFirst();
		linkedListMain.linkedListSecond();
		linkedListMain.linkedListThird();
		linkedListMain.linkedListFourth();
		linkedListMain.linkedListFifth();
		linkedListMain.linkedListSixth();
		linkedListMain.linkedListSeven();
		linkedListMain.linkedListEight();
		linkedListMain.linkedListNine();
		linkedListMain.linkedListTen();

		// 1. Write a Java program to append the specified element to the end of a
		// linked list.

	}

	public void linkedListFirst() {
		System.out.println("TASK NUMBER:01");
		System.out.println("\n");

		LinkedList<Integer> List1 = new LinkedList<Integer>();

		List1.add(5);
		List1.add(1);
		List1.add(4);
		List1.add(3);
		List1.add(2);
		System.out.println("The lsit is: \n " + List1);
		System.out.println("\n");
		System.out.println("TASK NUMBER:02");
		System.out.println("\n");

	}

	// 2. Write a Java program to iterate through all elements in a linked list.

	public void linkedListSecond() {

		LinkedList<String> List2 = new LinkedList<String>();

		List2.add("apple");
		List2.add("grapes");
		List2.add("orange");
		List2.add("banana");
		List2.add("pineapple");
		for (String element : List2) {
			System.out.println(element);
		}
		System.out.println("\n");
		System.out.println("TASK NUMBER:03");
		System.out.println("\n");
	}

	// 3. Write a Java program to iterate through all elements in a linked list
	// starting at the specified position.

	public void linkedListThird() {
		LinkedList<Integer> List3 = new LinkedList<Integer>();

		List3.add(5);
		List3.add(1);
		List3.add(4);
		List3.add(3);
		List3.add(2);

		System.out.println("Print the list: \n " + List3);
		Iterator element = List3.listIterator(1);

		System.out.println("Now print the list from second postion: ");
		while (element.hasNext()) {
			System.out.println(element.next());
		}
		System.out.println("\n");
		System.out.println("TASK NUMBER:04");
		System.out.println("\n");
	}

	// 4. Write a Java program to iterate a linked list in reverse order.

	public void linkedListFourth() {

		LinkedList<String> List4 = new LinkedList<String>();

		List4.add("apple");
		List4.add("grapes");
		List4.add("orange");
		List4.add("banana");
		List4.add("pineapple");

		System.out.println("Before Riversing:  \n " + List4);
		Collections.reverse(List4);
		System.out.println("After riversing: \n " + List4);
		System.out.println("\n");
		System.out.println("TASK NUMBER:05");
		System.out.println("\n");

	}

	// 5. Write a Java program to insert the specified element at the specified
	// position in the linked list.

	public void linkedListFifth() {

		LinkedList<Integer> List5 = new LinkedList<Integer>();

		List5.add(5);
		List5.add(1);
		List5.add(4);
		List5.add(3);
		List5.add(2);

		System.out.println("List of integer before update: \n " + List5);
		List5.set(1, 10);
		System.out.println("List of integer after update: \n " + List5);
		System.out.println("\n");
		System.out.println("TASK NUMBER:06");
		System.out.println("\n");
	}

	// 6. Write a Java program to insert elements into the linked list at the first
	// and last position.

	public void linkedListSixth() {
		LinkedList<String> List6 = new LinkedList<String>();

		List6.add("apple");
		List6.add("grapes");
		List6.add("orange");
		List6.add("banana");
		List6.add("pineapple");

		System.out.println("List of String before update: \n " + List6);

		List6.addFirst("COCONUT");
		List6.addLast("WATERMELON");

		System.out.println("List of String after update: \n " + List6);
		System.out.println("\n");
		System.out.println("TASK NUMBER:07");
		System.out.println("\n");

	}

	// 7. Write a Java program to insert the specified element at the front of a
	// linked list.

	public void linkedListSeven() {

		LinkedList<Integer> List7 = new LinkedList<Integer>();

		List7.add(5);
		List7.add(1);
		List7.add(4);
		List7.add(3);
		List7.add(2);

		System.out.println("List of integer before update: \n " + List7);
		List7.addFirst(100);
		System.out.println("List of integer after update: \n " + List7);
		System.out.println("\n");
		System.out.println("TASK NUMBER:08");
		System.out.println("\n");
	}

	// 8. Write a Java program to insert the specified element at the end of a
	// linked list.

	public void linkedListEight() {
		LinkedList<String> List8 = new LinkedList<String>();

		List8.add("apple");
		List8.add("grapes");
		List8.add("orange");
		List8.add("banana");
		List8.add("pineapple");

		System.out.println("List of String before update: \n " + List8);

		List8.addLast("MELON");

		System.out.println("List of String after update: \n " + List8);
		System.out.println("\n");
		System.out.println("TASK NUMBER:09");
		System.out.println("\n");

	}

	// 9. Write a Java program to insert some elements at the specified position
	// into a linked list.

	public void linkedListNine() {

		LinkedList<Integer> List9 = new LinkedList<Integer>();

		List9.add(5);
		List9.add(1);
		List9.add(4);
		List9.add(3);
		List9.add(2);

		System.out.println("List of integer before update: \n " + List9);
		List9.set(0, 6);
		List9.set(1, 9);

		System.out.println("List of integer after update: \n " + List9);
		System.out.println("\n");
		System.out.println("TASK NUMBER:10");
		System.out.println("\n");
	}

	// 10. Write a Java program to get the first and last occurrence of the
	// specified elements in a linked list.

	public void linkedListTen() {
		LinkedList<String> List10 = new LinkedList<String>();

		List10.add("apple");
		List10.add("grapes");
		List10.add("orange");
		List10.add("banana");
		List10.add("pineapple");

		System.out.println("Print the list: \n " + List10);

		String firstElement = List10.getFirst();
		System.out.println("First fruit is:  \n " + firstElement);

		String lastElement = List10.getLast();
		System.out.println("Last fruit is: \n " + lastElement);
	}

}
