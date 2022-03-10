package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeqeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque de = new ArrayDeque();
		de.add(11);
		de.add(12);
		de.add(13);
		de.add('t');
		System.out.println("Queue : "+de);
		de.addFirst("First");
		de.addLast("Last");
		System.out.println("Queue : "+de);
		
		Iterator itr =de.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}
		
		System.out.println("First Element : "+de.peekFirst());
		System.out.println("last element : "+de.peekLast());
		
		System.out.println("get element first : "+de.getFirst());
		System.out.println("get element last : "+de.getLast());
		
		de.pop();
		System.out.println("Queue : "+de);
		de.push(20.5);
		System.out.println("Queue : "+de);
		de.remove(12);
		System.out.println("Queue : "+de);
		

}
}