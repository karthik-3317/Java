package karthik;

public class ThreeChecker {
	static int n;
	static int count=0;
	static int SevenChecker()
	{
		if(n%3==0)
			count++;
		if(n%7==0)
			count++;
		return count;
	}
	public static void main(String[] args)
	{
		n=7;
		SevenChecker();
		if(count==0)
			System.out.println("NO ONE DIVISIBLE");
		else if(count==1)
		{
			System.out.println("just by one");
		}
		else if(count==2)
		{
			System.out.println("it is divisible by both");
		}
	}
}
