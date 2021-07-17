
public class quiz_5_3 extends c1 implements i1{
	public static void main(String[] args) {
		System.out.println(c1.s);
	}
}

interface i1{
	public String s = "abc";
}

class c1{
	public static String s="def";
}