package collectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class IteratorQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(11);
		queue.add(12);
		queue.add(13);
		queue.add(14);
		System.out.println("Queue : "+queue);
		
		//System.out.println("First Element: "+queue.element());
		
		//queue.forEach(e -> System.out.println("Foreach "+e));
		
		Iterator<Integer> itr = queue.iterator();
		
		while(itr.hasNext()) {
			int a = itr.next();
			if(a == 13) {
				itr.remove();
				break;
			}
		}
		itr.forEachRemaining(b -> System.out.println("Remaining element = "+b));
		
		System.out.println("Queue ="+queue);
		
	

	}
}
