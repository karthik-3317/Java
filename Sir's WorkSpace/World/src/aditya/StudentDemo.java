package aditya;
import java.util.Scanner;
public class StudentDemo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("enter your beautiful name");
		while(s.setName(sc.nextLine())==false)
		{
			System.out.println("Don't you know how to enter your name");
		}
		System.out.println("enter your gender");
		while(s.setGender(sc.next().charAt(0))==false)
		{
			System.out.println("Don't you know your gender");
		}
		System.out.println("enter your branch");
		while(s.setBranch(sc.next())==false)
		{
			System.out.println("You  waste enter your branch in the list provided");
			System.out.println(" CSE , EEE, ECE ,IT ");
		}
		System.out.println("enter your id no");
		while(s.setId(sc.nextLong())==false)
		{
			System.out.println("Are you mad enter your id properly");
		}
		System.out.println("your beautiful name is "+s.getName());
		System.out.println("your id no is "+s.getId());
		System.out.println("your gender is "+s.getGender());
		System.out.println("your branch is "+s.getBranch());
		sc.close();
	}
}
