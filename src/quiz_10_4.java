
public class quiz_10_4 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.setThread(t2);
		t2.setThread(t1);
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread{
	Thread t;
	@Override
	public void run() {
		System.out.println("t1");
		t.run();
		super.run();
	}
	Thread1(){}
	void setThread(Thread in_t) {
		this.t = in_t;
	}
}
class Thread2 extends Thread{
	Thread t;
	@Override
	public void run() {
		System.out.println("t2");
		t.run();
		super.run();
	}
	Thread2(){}
	void setThread(Thread in_t) {
		this.t = in_t;
	}
}