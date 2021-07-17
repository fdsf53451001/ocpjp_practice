
public class Thread_Practice_2 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(123);
	}
	public static void main(String[] args) {
		Thread_Practice_2 thread_Practice_2 = new Thread_Practice_2();
		Thread t = new Thread(thread_Practice_2);
		t.start();
		Thread.currentThread().interrupt();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finish");
	}	
}
