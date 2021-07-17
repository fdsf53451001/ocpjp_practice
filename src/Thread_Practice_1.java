
public class Thread_Practice_1 extends Thread{
	@Override
	public void run() {
		System.out.println(123);
		super.run();
	}
	public static void main(String[] args) {
		Thread_Practice_1 t1 = new Thread_Practice_1();
		t1.start();
		try {
			t1.sleep(5000);			
			//in fact, main thread sleep for 5 sec, not thread_1
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finish");
	}
}
