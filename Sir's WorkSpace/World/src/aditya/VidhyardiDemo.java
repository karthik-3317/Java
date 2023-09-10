package aditya;
import java.util.Scanner;
public class VidhyardiDemo {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	Vidhyardi v=new Vidhyardi();
	System.out.println("enter your r1 with respect to r2");
	while(v.setrad(sc.nextDouble(),sc.nextDouble())==false)
			{
		break;
			}
	System.out.println("your area as your values");
	System.out.println(v.findArea());
	sc.close();
}
}
