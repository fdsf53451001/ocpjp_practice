

public class quiz_7_11 {
	String name;
	int age;
	public quiz_7_11(String s,int i) throws Exception{
		if(name==null) {
			throw new NoNameException();
		}else if(age<=0 || age>=120) {
			throw new AgeOutOfRangeException();
		}else {
			this.name = s;
			this.age = i;
		}
	}
	public static void main(String[] args) {
		try {
			quiz_7_11 q = new quiz_7_11("Toby", 20);			
		}catch(Exception e) {
			
		}
	}
}

class NoNameException  extends Exception{}
class AgeOutOfRangeException extends Exception{}
