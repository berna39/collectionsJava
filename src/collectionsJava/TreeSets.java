package collectionsJava;
import java.util.TreeSet;

// TreeSets are just Sorted HashSets
public class TreeSets {
  public static void main(String[] args) {
	 TreeSet<String> ts = new TreeSet<String>();
	 ts.add("Azuma sarutobi");
	 ts.add("Kakuzu");
	 ts.add("Daidara");
	 ts.add("Nagato");
	 ts.add("Yaiko");
	 
	 ts.forEach(System.out::println);
}
}
