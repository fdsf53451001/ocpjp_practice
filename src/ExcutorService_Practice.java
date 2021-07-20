
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class ExcutorService_Practice {
	static AtomicInteger i = new AtomicInteger(0);
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		Map<Integer, Future<Integer>> result = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			Service1 service1 = new Service1();
			Future<Integer> future= es.submit(service1);  //取回號碼牌
			result.put(i, future);
		}
		for(Integer i : result.keySet()) {
			try {
				System.out.println(result.get(i).get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		es.shutdown();
	}
}

class Service1 implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		return ExcutorService_Practice.i.addAndGet(1);
	}
}