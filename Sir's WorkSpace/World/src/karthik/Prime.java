package karthik;

public class Prime {
	static  int a,b,c;
	static int prime,count;
	static int  Max()
	{
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else
			return c;
	}
	static int  Min()
	{
		if(a<b && a<c)
			return a;
		else if(b<a && b<c)
			return b;
		else
			return c;
	}
	static int PrintPrime0()
	{
		int i,c0 = 0;
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
				c0++;
		}
		return c0;
	}
	static int PrintPrime1()
	{
		int i,c1 = 0;
		for(i=1;i<=b;i++)
		{
			if(b%i==0)
				c1++;
		}
		return c1;
	}
		static int PrintPrime2()
		{
			int i,c2 = 0;
			for(i=1;i<=c;i++)
			{
				if(c%i==0)
					c2++;
			}
			return c2;
		}
			
	public static void main(String[] args)
	{
		a=12;
		b=13;
		c=14;
		System.out.println("the max is "+Max());
		System.out.println("the min is "+Min());
		if(PrintPrime0()==2)
			System.out.println(a+"it is prime");
		else
			System.out.println(a+"it is not a prime");
		if(PrintPrime1()==2)
			System.out.println(b+"it is prime");
		else
			System.out.println(b+"it is not a prime");
		if(PrintPrime2()==2)
			System.out.println(c+"it is prime");
		else
			System.out.println(c+"it is not a prime");
	}
}
