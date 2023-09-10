package aditya;

public class Armstrong {
	private static int n,temp,coo=0;
	private static int armstrong()
	{
		while(n>0)
		{
			temp=n%10;
			coo=coo+temp*temp*temp;
			n=n/10;
		}
		return coo;
	}
	public static void main(String args[])
	{
		int tem;
		n=153;
		tem=n;
		System.out.println(armstrong());
		if(tem==armstrong())
		{
			System.out.println("it is a armstrong number");
			
		}
		else 
		{
			System.out.println("it is not a armstrong number");
		}
	}

}
