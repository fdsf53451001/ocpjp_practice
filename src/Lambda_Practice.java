import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Lambda_Practice {
	public static void main(String[] args) {
		add_object<Integer> adder1 = i -> i.intValue()+1;
		add_object<Integer> adder2 = i -> {return i.intValue()+1;};
		add_object<Integer> adder3 = (Integer i) -> i.intValue()+1;
		ToIntFunction<Integer> adder4 = i -> i.intValue()+1;
		// int基本型別無法放入泛型，所以使用額外方法
		System.out.println(adder1.add(new Integer(5)));
		System.out.println(adder2.add(new Integer(5)));
		System.out.println(adder3.add(new Integer(5)));
		System.out.println(adder4.applyAsInt(new Integer(5)));
	}
}

@FunctionalInterface
interface add_object<T extends Integer>{
	public int add(T t);
}

