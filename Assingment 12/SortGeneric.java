import java.util.*;

public class SortGeneric {
	
	public static void main(String[] args) {
		
		ArrayList <Integer> i = new ArrayList<>();
		ArrayList <String> s = new ArrayList<>();
		
		i.add(1);
		i.add(6);
		i.add(3);
		
		s.add("pandey");
		s.add("Aryan");
		s.add("singla");
				
		Collections.sort(i);
		Collections.sort(s);
		
		System.out.println("Integers in Sorted order");
		System.out.println(i);
		
		System.out.println("Strings in Sorted order");
		System.out.println(s);
		
		
	}

}