package collectionsJava;
import java.util.Vector;

// just like an arrayList but the diffrence is that a vector can be used concurently(mulithread) and has less performance than an AL
public class Vectors {
	public static void main(String[] args) {
		Vector<Object> vector = new Vector<Object>();
		
		vector.addElement("Johnny");
		vector.addElement("Robert");
		vector.addElement("Kylian");
		vector.addElement("Salaam");
		
		vector.forEach(System.out::println);
		
		System.out.println(vector.capacity());
		
		System.out.println(vector.elementAt(3));
	}
}
