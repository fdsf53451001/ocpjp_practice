package Term2;

public class Generics_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m1 = new MyClass();
		m1.test(new Object());
		m1.test(new String("abc"));
		System.out.println(m1.test2().getClass());
	}

}

class MyClass<T>{
	public void test(T t1) {
		System.out.println(t1.getClass().equals(String.class));
	}
	public T test2(){
		return (T) "OK";
	}
}