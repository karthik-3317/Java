package aditya;
import java.util.Scanner;
public class TraingleDemo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Traingle t=new Traingle();
		System.out.println("enter your side 1");
		while(t.setSide1(sc.nextDouble())==false)
		{
			System.out.println("enter positive value");
		}
		System.out.println("enter your side 2");
		while(t.setSide2(sc.nextDouble())==false)
		{
			System.out.println("enter positive value");
		}
		System.out.println("enter your side 3");
		while(t.setSide3(sc.nextDouble())==false)
		{
			System.out.println("enter positive value");
		}
		System.out.println("the area of traingle "+t.getfindArea());
		sc.close();
	}
}
