package generic;

import java.util.Scanner;

public class AoopGenericDemo {

	public static void main(String[] args) {
		AoopGeneric<String> top=new AoopGeneric(2,3,4);
//		System.out.println(top.adi);
	    ClassGen obj=new ClassGen();
	    Scanner sc=new Scanner(System.in);
	    AoopGeneric<ClassGen> top2=new AoopGeneric(sc.nextInt(),sc.nextInt(),sc.nextInt());
	    System.out.println(top2.adi);
	    System.out.println(obj.as);
	}

}
