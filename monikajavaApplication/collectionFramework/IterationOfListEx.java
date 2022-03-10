package collectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterationOfListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			list.add(1);
			list.add(5);
			list.add(85);
			list.add(65);
			
			System.out.println("Array List : "+list);
			ListIterator<Integer> itr = list.listIterator();
			while(itr.hasNext()) {
				int i = itr.next();
				if(i == 85) {
					//itr.remove();
					//itr.next();
					//itr.add(21);
					itr.set(99);
					break;
				}
			}
			itr.forEachRemaining(e -> System.out.println(e));
			System.out.println("Array List: "+list);
			
	}

}
