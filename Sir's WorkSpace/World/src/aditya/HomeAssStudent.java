package aditya;
import java.util.Scanner;
public class HomeAssStudent {
	private static String name;
	private static long id;
	private static int x[]=new int[3];
	private static int total=0,i;
	private static int findTotal()
	{
		for(i=0;i<3;i++)
		{
			total=total+x[i];
		}
		return total;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		name=sc.nextLine();
		System.out.println("enter your id");
		id=sc.nextLong();
		System.out.println("enter your three subject marks ");
		for(i=0;i<3;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("name="+name+"\n"+"id="+id+"\n"+"your total = "+findTotal());
		sc.close();
	}
}
