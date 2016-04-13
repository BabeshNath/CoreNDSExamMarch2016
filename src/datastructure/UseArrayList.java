package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		List<String> list = new ArrayList<String>();  // A List contains instances of Object. Upcast ArrayList to List
		list.add("Lima");            // add() takes Object. String upcast to Object implicitly
		list.add("Mima");
		list.add("Shima");

		System.out.println(list);

		for(int i = 0; i<=list.size()+1; i ++ ) {
			System.out.println(list.remove("Shima"));
		}
		// Get a "iterator" instance from List to iterate thru all the elements of the List
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {      // any more element
			// Retrieve the next element, explicitly downcast from Object back to String
			String str = (String)iter.next();
			System.out.println(str);
		}
	}

}
