package Term2;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_test {
	public static void main(String[] args) {
		Map<String,String> t1 = new TreeMap<String,String>();
		t1.put("a","5");
		t1.put("b","4");
//		for(String s1: t1.values()) {
//			System.out.println(s1);
//		}
		for(String s1 : t1.keySet()) {
			System.out.println(t1.get(s1));
		}
	}
}
