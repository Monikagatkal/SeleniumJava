package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue queue = new PriorityQueue();
		queue.add(11);
		queue.add(12);
		queue.add(13);
		queue.add(14);
		System.out.println("Queue : "+queue);
		
		Queue queue1 = new PriorityQueue();
		queue1.add(15);
		queue1.add(16);
		queue1.add(17);
		queue1.add(18);
		System.out.println(queue.size());//size is 4
		
		Integer i = new Integer(13);
		boolean b = queue.contains(i);
		System.out.println(i+ " Contains is available "+b);
		
		boolean b1 = queue1.containsAll(queue);
		System.out.println("Data is available " +b1);
		
		//queue.contains(12);
		
		System.out.println("Queue1 : "+queue1);
		
		queue1.addAll(queue);
		System.out.println(queue1);
		
		
		queue.clear();
		System.out.println(queue);
		
		

		
		

	}

}
