package collectionsJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
	public static void main(String[] args) {
		List li = new ArrayList<String>();
		
		li.add("Google");
		li.add("Amazon");
		li.add("Facebook");
		li.add("Apple");
		li.add("Microsoft");
		
		li.forEach(System.out::println);
	}
}
