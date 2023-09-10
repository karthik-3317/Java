package files;
import java.util.Scanner;
public class SingleDemo {
	public static void main(String[] args)
	{
		Single scc=Single.getObject();
		Single upi=Single.getObject();
		Single phonepe=Single.getObject();
		Scanner sc=new Scanner(System.in);
		boolean loop;
		loop=true;
		
		while(loop)
		{
			System.out.println("how to pay your payment");
			System.out.println("1. pay through scc  2. pay through upi 3. pay through phonepe");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println(scc);
			case 2:
				System.out.println(upi);
			case 3:
				System.out.println(phonepe);
				default :
					loop=false;
		}
		}
	}
}
