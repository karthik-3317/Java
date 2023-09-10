package aditya;

public class isPrime {

	private static int n,i;
	private static boolean oNumber()
	{
		if(n==1)
		{
			return false;
		}
		else
		{
			for(i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
		}
	}
	public static void main(String[] args)
	{
		n=11;
		if(oNumber())
		{
			System.out.println("its a prime number");
		}
		else 
		{
			System.out.println("its not a prime number");
		}
	}
}
