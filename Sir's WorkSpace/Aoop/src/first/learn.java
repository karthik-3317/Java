package first;
import java.util.Scanner;
public class learn {
	
	public static int myfunction(int x,int y)
	{
		System.out.println("You got your answer");
		return (int) Math.sqrt(x);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int a=sc.nextInt();
		System.out.println("Enter your second number");
		int b=sc.nextInt();
		int catchme=myfunction(a,b);
		System.out.println(catchme);
	}

}
