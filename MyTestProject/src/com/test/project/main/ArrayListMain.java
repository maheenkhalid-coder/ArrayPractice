package com.test.project.main;

import java.util.*;

public class ArrayListMain {

	public static void main(String[] args) {
		
		
			ArrayListMain arrayListMain = new ArrayListMain();

		arrayListMain.arraysFirst();
		arrayListMain.arraysSecond();
		arrayListMain.arraysThird();
		arrayListMain.arraysFourth();
		arrayListMain.arraysFifth();
		arrayListMain.arraysSixth();
		arrayListMain.arraysSeven();
		arrayListMain.arraysEight();
		arrayListMain.arraysNinth();
		arrayListMain.arrayTen();
		
	}
	

	public void arraysFirst() {
		System.out.println("TASK NUMBER:01");
		System.out.println("\n");

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Yellow");
		list1.add("Purple");
		list1.add("Blue");
		list1.add("Red");
		list1.add("Black");
		System.out.println(list1);
		System.out.println("\n");
		System.out.println("TASK NUMBER:02");
		System.out.println("\n");
	}

	public void arraysSecond() {
		ArrayList<String> List2 = new ArrayList<String>();
		List2.add("Red");
		List2.add("Purple");
		List2.add("Orange");
		List2.add("Green");
		List2.add("Black");
		for (String element : List2) {
			System.out.println(element);
		}
		System.out.println("\n");
		System.out.println("TASK NUMBER:03");
		System.out.println("\n");
	}

	public void arraysThird() {
		ArrayList<String> List3 = new ArrayList<String>();
		List3.add("Black");
		List3.add("Green");
		List3.add("Blue");
		List3.add("White");
		List3.add("Red");
		System.out.println("Before Riversing:  \n " + List3);
		Collections.reverse(List3);
		System.out.println("After riversing: \n " + List3);
		System.out.println("\n");
		System.out.println("TASK NUMBER:04");
		System.out.println("\n");
	}

	public void arraysFourth() {
		ArrayList<Integer> List4 = new ArrayList<Integer>();
		List4.add(1);
		List4.add(3);
		List4.add(5);
		List4.add(7);
		List4.add(9);
		List4.add(11);
		System.out.println("List of integers: \n " + List4);
		Integer integer = List4.get(0);
		System.out.println("Reterive the first integer: \n " + integer);
		integer = List4.get(5);
		System.out.println("Reterive the last integer:  \n " + integer);
		System.out.println("\n");
		System.out.println("TASK NUMBER:05");
		System.out.println("\n");
	}

	public void arraysFifth() {
		ArrayList<String> List5 = new ArrayList<String>();
		List5.add("Red");
		List5.add("Pink");
		List5.add("Purple");
		List5.add("White");
		List5.add("Maroon");
		System.out.println("List of String before update: \n " + List5);
		List5.set(1, "Blue");
		System.out.println("List of String after update: \n " + List5);
		System.out.println("\n");
		System.out.println("TASK NUMBER:06");
		System.out.println("\n");
	}

	public void arraysSixth() {
		ArrayList<Integer> List6 = new ArrayList<Integer>();
		List6.add(1);
		List6.add(3);
		List6.add(5);
		List6.add(7);
		List6.add(9);
		List6.add(11);
		System.out.println("List of integer before update: \n " + List6);
		List6.remove(5);
		List6.remove(2);
		System.out.println("List of integer after update: \n " + List6);
		System.out.println("\n");
		System.out.println("TASK NUMBER:07");
		System.out.println("\n");
	}

	public void arraysSeven() {
		ArrayList<String> List7 = new ArrayList<String>();
		List7.add("Maroon");
		List7.add("Pink");
		List7.add("Orange");
		List7.add("Green");
		List7.add("Purple");
		System.out.println(List7);
		if (List7.contains("White")) {
			System.out.println("Found the element");
		} else {
			System.out.println("There is no such element");
		}
		System.out.println("\n");
		System.out.println("TASK NUMBER:08");
		System.out.println("\n");
	}
	
	public void arraysEight() {
		ArrayList<Integer> List8 = new ArrayList<Integer>();
		List8.add(1);
		List8.add(6);
		List8.add(5);
		List8.add(10);
		List8.add(2);
		List8.add(3);
		System.out.println("List of integer before update: \n " + List8);
		Collections.sort(List8);
		System.out.println("List of integer after update: \n " + List8);
		System.out.println("\n");
		System.out.println("TASK NUMBER:09");
		System.out.println("\n");
	}
	public void arraysNinth() {
		ArrayList<Integer> List9A = new ArrayList<Integer>();
	
		List9A.add(2);
		List9A.add(4);
		List9A.add(6);
		List9A.add(8);
		List9A.add(10);
	
		ArrayList<Integer> List9B = new ArrayList<Integer>();
		List9B.add(1);
		List9B.add(3);
		List9B.add(5);
		List9B.add(7);
		List9B.add(9);
	
		System.out.println("First list: \n " +List9A);
		System.out.println("Second lsit: \n " +List9B);
		
		Collections.copy(List9A, List9B);
		System.out.println("Now print list2 to List1 ");
		System.out.println("First list: \n " +List9A);
		System.out.println("Second lsit: \n " +List9B);
		System.out.println("\n");
		System.out.println("TASK NUMBER:10");
		System.out.println("\n");
		
	}
	
	public void arrayTen() {
		ArrayList<String> List10 = new ArrayList<String>();
		List10.add("Pink");
		List10.add("Blue");
		List10.add("Orange");
		List10.add("Red");
		List10.add("Black");
		
		System.out.println("List before Shuffling: \n" +List10);
		Collections.shuffle(List10);
		System.out.println("List after Shuffling: \n" +List10);
		System.out.println("\n");
	}	
}
