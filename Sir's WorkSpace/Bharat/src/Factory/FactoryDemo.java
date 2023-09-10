package Factory;

import java.util.Scanner;

public class FactoryDemo {

	public static void main(String[] args) {
	 FactoryClass fd=new FactoryClass();
	 Scanner sc=new Scanner(System.in);
		String className=sc.next();
		Shape s=fd.getOject(className);
		System.out.println(s.findArea());
	}
}
