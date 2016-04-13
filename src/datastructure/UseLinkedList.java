package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		// create a LinkedList
		LinkedList<String> list = new LinkedList<String>();

		// add some elements
		list.add("Java");
		list.add("World");
		list.add("in Mars");

		// print the list
		System.out.println("LinkedList:" + list);
		//peek at the head of the list
		System.out.println("Head of the list:" + list.peek());
		//for each to
		for(int i = 0; i<=list.size()+1; i ++ ) {
			System.out.println(list.remove("in Mars"));
		}
		// Get a "iterator" instance from List to iterate thru all the elements of the List
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {      // any more element
			// Retrieve the next element, explicitly downcast from Object back to String
			String str = (String)iter.next();
			System.out.println(str);
		}

		//System.out.println(list.removeFirst());
	}

}
