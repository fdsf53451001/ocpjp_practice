
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception_practice {
	public static void main(String[] args) {
		try {
			new Exception_practice().test();
		}catch(Exception e) {
			for(Throwable t : e.getSuppressed()) {
				t.printStackTrace();
			}			
		}
	}
	public void test() throws Exception{
		Exception e = null;
		try {
			throw new FileNotFoundException();
		}catch(Exception e2) {
			e = e2;
		}finally {
			e.addSuppressed(new IOException());
			throw e;
		}
	}
}
