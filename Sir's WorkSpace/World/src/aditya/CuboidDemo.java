package aditya;
import java.util.Scanner;
public class CuboidDemo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Cuboid c=new Cuboid();
		System.out.println("Enter your length ");
		while(c.setL(sc.nextDouble())==false)
		{
			System.out.println("Reenter your length");
		}
		System.out.println("Enter your breadth");
		while(c.setB(sc.nextDouble())==false)
		{
			System.out.println("Reenter your breadth");	
		}
		System.out.println("Enter your height");
		while(c.setH(sc.nextDouble())==false)
		{
			System.out.println("Reenter your height");
		}
		System.out.println("Your area of the cuboid is " + c.getfindVolume());
		sc.close();
	}
}
