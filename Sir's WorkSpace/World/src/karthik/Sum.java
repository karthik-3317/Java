package karthik;
import java.util.Scanner;
public class Sum
{
	public static String firstname;
	public static String lastname;
	Sum(String first,String second)
	{
		this.firstname=first;
		this.lastname=second;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter your First Name and Second Name");
		Scanner sc=new Scanner(System.in);
		Sum obj=new Sum(sc.next(),sc.next());
		System.out.println("Your full name is "+firstname+" "+obj.lastname);
	}
}
