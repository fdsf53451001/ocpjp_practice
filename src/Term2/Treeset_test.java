package Term2;

import java.util.Set;
import java.util.TreeSet;

public class Treeset_test {
	public static void main(String[] args) {
		Set<Integer> s1 = new TreeSet<>();
		s1.add(7);
		s1.add(6);
		s1.add(7);
		for(Integer i : s1) {
			System.out.println(i);
		}
	}
}
