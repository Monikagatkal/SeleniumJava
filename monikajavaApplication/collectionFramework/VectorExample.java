package collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector = new Vector<>();
		vector.addElement(807);
		vector.addElement("data");
		vector.addElement(97);
		vector.addElement("selenium");
		vector.addElement(null);
		vector.addElement(52100);
		
		System.out.println("Vector :"+vector);
		System.out.println("Vector Capacity: "+vector.capacity());
		System.out.println("Vector Size: "+vector.size());
		vector.trimToSize();
		System.out.println("Vector Capacity: "+vector.capacity());
		System.out.println("Element at: "+vector.elementAt(2));
		Enumeration en =vector.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
	}

}
