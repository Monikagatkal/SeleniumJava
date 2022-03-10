package collectionFramework;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet set = new TreeSet<>();
		set.add("Monika");
		set.add("Pooja");
		set.add("Kritika");
		set.add("Khushboo");
		
		System.out.println("Treeset Values :"+set);
		System.out.println("Ceiling :"+set.ceiling("A"));
		
		NavigableSet set1 = set.descendingSet();
		System.out.println("Descending set = "+set1);
		
		System.out.println("First Values :"+set.first());
		System.out.println("floor :"+set.floor("P"));
		
		SortedSet set2 = set.headSet("Monika");
		System.out.println("HeadSet value = :"+set2);
		
		System.out.println("Higher Values :"+set.higher("N"));
		
		System.out.println("Lower Value :"+set.lower("k"));
		
		set2 = set.tailSet("Monika");
		System.out.println("Tail set : "+set2);
		
		
		
	}

}
