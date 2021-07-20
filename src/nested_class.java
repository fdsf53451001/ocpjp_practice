

public class nested_class {
	class InnerClass{
		public void out() {
			System.out.println("InnerClass");
		}
	}
	static class InnerClass2{
		public void out2() {
			System.out.println("InnerClass2");
		}
	}
	AnonymousSample a1 = new AnonymousSample() {
		public void out3() {
			System.out.println("override by inner");
		}
	};
	public static void main(String[] args) {
		nested_class n1 = new nested_class();
		InnerClass l1 = n1.new InnerClass();
		l1.out();
		InnerClass2 l2= new nested_class.InnerClass2();
		l2.out2();
		n1.a1.out3();
	}

}

class AnonymousSample{
	public void out3() {
		System.out.println("AnonymousSample");
	}
}