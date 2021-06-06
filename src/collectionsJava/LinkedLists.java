package collectionsJava;
import java.util.LinkedList;
import java.util.ListIterator;

// we'll use linkedLinst when any element of our list has a link with the next element of the list and the previous
public class LinkedLists {
	   public static void main(String[] args) {
		   LinkedList li = new LinkedList();
		   li.add("Hashirama");
		   li.add("Tobirama");
		   li.add("Sarutobi");
		   li.add("Minato");
		   li.add("Tsunade");
		   li.add(5);
		   li.add(null);
		   
		   
		   System.out.println("==== Loop =====");
		   // fetch with loop
		   for(int i=0; i < li.size(); i++) {
			   System.out.println(li.get(i));
		   }
		   
		   
		   System.out.println("==== Iterator =====");
		   //fetch with iterator
		   ListIterator lit = li.listIterator();
		   
		   while(lit.hasNext()){
			   System.out.println(lit.next());
		   }
		   
		   System.out.println("==== Methods =====");
		   
		   // adding
		   li.add(4);
		   // removing
		   li.remove(5);
		   // is empty ?
		   
		   System.out.println(li.isEmpty());
		   System.out.println(li.contains("Sasuke"));
		  
		   
 	   }
}
