package collectionsJava;
import java.util.HashMap;

// just a hashset that can accept null value and it is thread safe
public class HashMaps {
	public static void main(String[] args) {
		HashMap< String, Integer> ports = new HashMap<String, Integer>();
		ports.put("ssh", 22);
		ports.put("http", 80);
		ports.put("https", 443);
		ports.put("ftp", 25);
		ports.put("mysql", 3306);
		ports.put("postgres", 5432);
		ports.put("pph", null);
		

	}
}
