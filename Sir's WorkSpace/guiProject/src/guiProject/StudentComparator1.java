package guiProject;

import java.util.Comparator;

public class StudentComparator1 implements Comparator<Student>{
	public int compare(Student o1, Student o2) {
		return (int)o1.cgpa-(int)o2.cgpa;
	}
	

}
