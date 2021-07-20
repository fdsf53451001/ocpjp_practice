
import java.util.concurrent.CyclicBarrier;

public class CycleBarrier_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stopUntil = 2;
		final CyclicBarrier barrier = new CyclicBarrier(stopUntil);
		for(int i=0;i<3;i++) {
			new Thread(){
				public void run() {
					try {
						System.out.println("before await");
						barrier.await();
						System.out.println("after await");						
					} catch (Exception e) {
					}
				};
			}.start();
		}
	}

}
