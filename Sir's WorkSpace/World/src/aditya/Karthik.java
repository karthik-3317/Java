package aditya;

public class Karthik {
	private static double n,i, temp=0;;
	public static void main(String args[])
	{
		n=5;
		System.out.println("IN THE PROCESS OF CHECKING PRIME");
		if(isPrime()==2)
			System.out.println("it is a prime number");
		else
			System.out.println("it is not a prime number");
	}
	public static double isPrime()
	{
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				temp++;
			}
		}
		return temp;
	}

}
