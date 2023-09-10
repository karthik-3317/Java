package Threads;

import java.util.Scanner;

public class MythreadFact {

	public static void main(String[] args) {
		System.out.println("This is only main thread");
		MythreadFactChild1 child1=new MythreadFactChild1();
		Thread thr=new Thread(child1);
		thr.start();
	}

}
class MythreadFactChild1 implements Runnable{
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number to find the factorial");
		int fact=sc.nextInt(),sum=1;
		for(int i=fact;i>0;i--)
		{
			sum=sum*i;
		}
		System.out.println("The factorial of the output "+sum);
	}
}