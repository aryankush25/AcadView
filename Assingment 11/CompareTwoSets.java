import java.util.*;

public class CompareTwoSets {

	public static void main(String[] args) {
		
		HashSet set1 = new HashSet();
		HashSet set2 = new HashSet();
		
		set1.add(2);
		set1.add(4);
		set1.add("Aryan");
		set1.add(8);
		set1.add(1);
		
		set2.add(1);
		set2.add(3);
		set2.add(5);
		set2.add("Aryan");
		Iterator itr1 = set1.iterator();
		Iterator itr2 = set2.iterator();
		
		set1.retainAll(set2);
		set2.retainAll(set1);
		
		System.out.println("All Common Elements Are " + set2);
		
	}

}
