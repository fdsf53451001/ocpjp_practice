import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamPractice {
	public static void main(String[] args) {
		String Path = "file1.txt";
//		String s = "abc";
//		try(BufferedWriter bWriter = new BufferedWriter(new FileWriter(Path))){			
//			bWriter.write(s);
//			bWriter.write(s);
//			bWriter.write(s);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		String s = "";
		try(BufferedReader brBufferedReader = new BufferedReader(new FileReader(Path))){
			s = brBufferedReader.readLine();
			brBufferedReader.mark(1);
			s = brBufferedReader.readLine();
			s = brBufferedReader.readLine();
			s = brBufferedReader.readLine();
			brBufferedReader.reset();
			System.out.println(s);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
