package Term2;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_test {
	public static void main(String[] args) {
		Deque<Integer> d1 = new ArrayDeque<>();
		// run as Stack
		d1.push(5);
		d1.push(6);
		System.out.println(d1.pop());
		System.out.println(d1.pop());
		// run as Queue
		d1.add(5);
		d1.add(6);
		System.out.println(d1.remove());
		System.out.println(d1.remove());
	}
}
