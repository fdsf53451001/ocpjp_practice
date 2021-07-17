import java.util.ArrayList;
import java.util.List;

public class FlatMap_Practice {
	class Outer{
		Inner i = new Inner();
		public Outer() {
			// TODO Auto-generated constructor stub
		}
	}
	class Inner{
		List<Integer> list = new ArrayList<>();
		Inner(){
			list.add(100);
		}
	}
	public static void main(String[] args) {
		FlatMap_Practice fmp = new FlatMap_Practice();
		List<Outer> l = new ArrayList<>();
		for (int i = 0; i < 3;i++) {
			l.add(fmp.new Outer());
		}
		System.out.println(l.stream()
				 .flatMap(o ->o.i.list.stream())
				 .count()
		);		
	}
}
