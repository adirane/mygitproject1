package javaTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arraylistlinkedlist {

	public static void main(String[] args) {

		List<String > al= new ArrayList<String>();
		System.out.println("The initial size of array is " +al.size());
		al.add("A");
		al.add("b");
		al.add("c");
		al.add("d");

		System.out.println("The  size of array after adding is " +al.size());

		al.remove("A");

		System.out.println("The  size of array after removing is " +al.size());

		System.out.println(al);
		
		LinkedList<String > ll= new LinkedList<String>();
		System.out.println("The initial size of LnkedList is " +ll.size());
		ll.add("A");
		ll.add("b");
		ll.add("c");
		ll.add("d");

		System.out.println("The  size of LnkedList after adding is " +ll.size());

		ll.remove("A");

		System.out.println("The  size of LnkedList after removing is " +ll.size());

		System.out.println(ll);
		

	}

}
