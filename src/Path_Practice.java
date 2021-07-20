
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Path_Practice {
	public static void main(String[] args) {
		Path p1 = Paths.get("C:/123");
		System.out.println(p1.getFileName());
		System.out.println(p1.toAbsolutePath());
//		Path p2 = p1.resolve("a.txt");
//		Path p3 = p1.resolve("456");
		Path p2 = Paths.get("C:/123/a.txt");
		Path p3 = Paths.get("C:/123/456");
//		System.out.println(p2.toAbsolutePath());
//		System.out.println(p3.toAbsolutePath());
		try {
			Files.move(p2,p3,StandardCopyOption.REPLACE_EXISTING,LinkOption.NOFOLLOW_LINKS);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
