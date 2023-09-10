package Threads;

import java.util.Scanner;

class Mythreads implements Runnable {

	@Override
	public void run() {
	    System.out.println("Enter your number");
	    Scanner sc=new Scanner(System.in);
	    int fib=sc.nextInt();
	    int f1=0,f2=1,f3;
	    System.out.println(f1);
	    System.out.println(f2);
	    for(int i=2;i<fib;i++)
	    {
	     f3=f2+f1;
	     System.out.println(f3);
	     f1=f2;
	     f2=f3;
	    }
	}
}
 public class Mythread {
	public static void main(String[]args)
	{
		Mythreads myobj= new Mythreads();
		Thread mytr=new Thread(myobj);
		mytr.start();
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
		}
		System.out.println("The main method thread is going to be execute");
	}
}
