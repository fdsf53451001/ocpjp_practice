

public class singleton_design {
	private static final singleton_design Item = new singleton_design();
	private int num=10;
	private singleton_design() {
		System.out.println("Construct");
	}
	public static singleton_design getItem() {
		return(Item);
	}
	public int getVal() {
		return num;
	}
	public static void main(String[] args) {
		System.out.println(singleton_design.getItem().getVal());		
	}
}