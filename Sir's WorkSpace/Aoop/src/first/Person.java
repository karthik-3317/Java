package first;

import java.util.Scanner;

public class Person {
	private static String name;
	private static int age;
	public Person()
	{
		this.name="karthik";
		this.age=18;
	}
	public static void printperson()
	{
		System.out.println("The name "+name+" The age "+age);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Person obj=new Person();
		Person.printperson();
	}

}
