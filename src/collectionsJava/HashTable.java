package collectionsJava;
import java.util.Enumeration;
import java.util.Hashtable;

// doesn't accept null values
public class HashTable {
	public static void main(String[] args) {
		Hashtable< String, Integer> ports = new Hashtable<String, Integer>();
		ports.put("ssh", 22);
		ports.put("http", 80);
		ports.put("https", 443);
		ports.put("ftp", 25);
		ports.put("mysql", 3306);
		ports.put("postgres", 5432);
		
		Enumeration e = ports.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		System.out.println(ports.containsKey("mysql"));
		System.out.println(ports.contains(443));
				}
}
