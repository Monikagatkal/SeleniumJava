package collectionFramework;

import java.util.ArrayList;
import java.util.Comparator;

public class SortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(5);
		list.add(85);
		list.add(65);
		
		System.out.println("Array List : "+list);
		
		list.sort(new Comparator<Integer>()
				{
				public int compare(Integer o1, Integer o2)
				{
				//return o1.compareTo(o2); //ascending sort
				return o2.compareTo(o1); //descending sort
				}
			});
		System.out.println("Sorted Array List : "+list);
	}

}
