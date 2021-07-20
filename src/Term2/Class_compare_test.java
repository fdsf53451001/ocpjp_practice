package Term2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Class_compare_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<Student> s1 = new TreeSet<>();
		Set<Student> s1 = new TreeSet<>(new StudentComparator());		
		s1.add(new Student(20));
		s1.add(new Student(19));
		for(Student s : s1) {
			System.out.println(s.age);
		}
		
	}

}

class Student implements Comparable<Student>{
	int age = 18;
	Student(int age){
		this.age = age;
	}
	@Override
	public int compareTo(Student s) {	
		return Integer.valueOf(this.age).compareTo(Integer.valueOf(s.age));
	}	
}

class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		return Integer.valueOf(arg0.age).compareTo(Integer.valueOf(arg1.age));
	}
	
}
