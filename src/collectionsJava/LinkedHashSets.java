package collectionsJava;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSets {
	public static void main(String[] args) {
		LinkedHashSet<String> hokagues = new LinkedHashSet<String>();
		hokagues.add("Hashirama");
		hokagues.add("Tobirama");
		hokagues.add("Sarutobi");
		hokagues.add("Minato");
		hokagues.add("Tsunade");
		
		
		Iterator<String> it = hokagues.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
