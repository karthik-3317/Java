package guiProject;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class ArraylistComparator {
	
	public static void main(String [] args)
	{
		boolean loop=true;
		Vector<Student> tu=new Vector<Student>();
		Scanner sc=new Scanner(System.in);
		while(loop)
		{
			System.out.println("1.add new student details\n 2.display \n 3.sort by id \n 4.sort by cgpa \n others exit");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("your name and add and mark and cgpa");
				tu.add(new Student(sc.next(),sc.next(),sc.nextInt(),sc.nextFloat()));
				break;
			case 2:
				for(Student y:tu)
					System.out.println(y);
				break;
			case 3:
				Collections.sort(tu,new StudentComparator());
				break;
			case 4:
				Collections.sort(tu,new StudentComparator1());
				break;
				default :
					loop=false;
			}
		}
	}

}
