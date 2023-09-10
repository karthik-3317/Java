package aditya;

public class Palidrome {

	private static int n;
	private static boolean oPalin()
	{
		int temp,key,run=0;
		key=n;
		while(n>0)
		{
			temp=n%10;
			run=run*10+temp;
			n=n/10;
		}
		if(key==run)
			return true;
		else
			return false;
}
	public static void main(String[] args)
	{
		n=11211;
		if(oPalin())
		System.out.println("its a palindrome number");
		else
			System.out.println("its not a palindrome number");
	}
}
