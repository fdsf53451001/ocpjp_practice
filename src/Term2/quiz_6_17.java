package Term2;

public class quiz_6_17 {

	public static void main(String[] args) {
		MyFoo<String,String> f = MyFoo.<String> twice("123");
		System.out.println(f.getKey());
		System.out.println(f.getValue());
	}

}

class MyFoo<K,V>{
	private K key;
	private V value;
	public MyFoo(K k,V v) {
		this.key = k;
		this.value = v;
	}
	public static <T> MyFoo<T,T> twice(T value){
		return new MyFoo<T,T>(value,value);
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}