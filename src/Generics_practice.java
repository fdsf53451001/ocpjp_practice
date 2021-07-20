
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;

public class Generics_practice {
	public static void main(String[] args) {
		Student s1 = new Student(9);
		Student s2 = new Student(2);
		Set<Student> l1 = new TreeSet<>();
		l1.add(s1);
		l1.add(s2);
		for(Student s : l1) {
			System.out.println(s.stu_id);
		}
	}
	
}

class Student implements Comparable<Student>{
	int stu_id;
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return new Integer(stu_id).compareTo(new Integer(s.stu_id));
	}
	public Student(int id) {
		this.stu_id = id;
	}
}