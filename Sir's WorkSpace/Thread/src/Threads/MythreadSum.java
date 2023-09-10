package Threads;

import java.util.Scanner;

public class MythreadSum {
	public static void main(String[]args)
	{
		MythreadSumChild1 obj=new MythreadSumChild1();
		Thread thr=new Thread(obj);
		thr.start();
	}
}


//Child classes we are having the access some what low when compared to main class which is name
//of the class so in above example we are having the class of public now we must create the less
//mode of access that is default so we are using the default for the rest of the classes
//Note only child classes can implements the Runnable 

class MythreadSumChild1 implements Runnable{

	@Override
	public void run() {
		//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two elements");
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("the sum of the two numbers is " +(a+b));
	}
     
}