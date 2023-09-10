package aditya;
import java.util.Scanner;
public class CircleDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		System.out.println("enter your radius");
		while(c.setRadius(sc.nextDouble())==false);
		{
			System.out.println("hi");
		}
		System.out.println(c.getRadius());
		System.out.println(c.getfindArea());
		sc.close();
	}
}
