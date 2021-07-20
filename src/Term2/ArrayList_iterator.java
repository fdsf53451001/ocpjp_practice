package Term2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_iterator {
	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<>();
		a1.add(5);
		a1.add(6);
		a1.add(7);
		Iterator a1_it = a1.iterator();
		while(a1_it.hasNext()) {
			System.out.println(a1_it.next());
		}
		for(Integer i : a1) {
			System.out.println(i);
		}
	}
}
