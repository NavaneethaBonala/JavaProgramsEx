package set;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {

		LinkedHashSet h =  new LinkedHashSet();
		
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);

		System.out.println(h.add(12));
		System.out.println(h.add("Z"));

		System.out.println(h);
		
	}
}
