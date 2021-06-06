package collectionsJava;

import java.util.HashSet;
import java.util.Iterator;

// sets are lists without duplicates values
public class HashSets {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Toto");
		hs.add("Titi");
		hs.add("Tito");
		hs.add("Toto");
		
		hs.forEach(System.out::println);
	}
}
