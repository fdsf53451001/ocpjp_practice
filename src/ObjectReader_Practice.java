import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectReader_Practice {
	public static void main(String[] args) {
		String path = "File2.ser";
//		Skirt s1 = new Skirt("test", 1);
//		try(ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(path))){
//			o.writeObject(s1);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		Skirt s2 = new Skirt("", 0);
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))){
			s2 = (Skirt) ois.readObject();
			System.out.println(s2.name + " " + s2.size);
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class Skirt implements Serializable{
	private static final long serialVersionUID = -2364091815796950159L;
	String name;
	int size;
	public Skirt(String s,int i) {
		this.name = s;
		this.size = i;
	}
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		System.out.println("write");
	}
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException,IOException{
		ois.defaultReadObject();
		System.out.println("read");
	}
}