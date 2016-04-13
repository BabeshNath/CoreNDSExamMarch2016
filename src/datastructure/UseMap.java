package datastructure;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		//use linkedHashMap...because if you use hashMap only it may not give you the right order of data.
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("UK", "London");
		map.put("Can"," Ottowa");
		map.put("US", "New York");
		map.put("Ger", "Frankfort");

		for(Map.Entry<String,String> st:map.entrySet()) {
			System.out.println(st.getKey() + " .....> "+ st.getValue());
		}
		//iterator to retrieve data from the map
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println (it.next() );
		}
	}

}
