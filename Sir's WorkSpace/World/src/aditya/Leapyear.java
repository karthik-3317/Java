package aditya;

public class Leapyear {

	private static int n;
	public static void main(String[] args)
	{
		n=2003;
		if(oYear())
		{
			System.out.println("its a leap year");
		}
		else
		{
			System.out.println("its not a leap year");
		}
	}
	private static boolean oYear()
	{
		if(n%100==0)
		{
			if(n%400==0)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		else
		{
			if(n%4==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}