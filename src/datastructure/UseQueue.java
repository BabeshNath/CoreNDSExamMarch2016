package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> line = new LinkedList<String>();
		line.add("Rocky");
		line.add("David");
		line.add("New York");

		for(int i = 0; i<=line.size()+1; i ++ ) {
			System.out.println(line.peek());

			Iterator<String> it = line.iterator();
			while (it.hasNext()) {
				System.out.println (it.next() );
			}
			System.out.println(line.remove("New York"));
		}
	}
}
