package aditya;
public class HomeAssAdd 
{
	private static int total; 
	private static int x,y,z;
	private static int add(int x)
	{
		total=x;
		return total;
	}
	private static int add(int x,int y)
	{
		total=x+y;
		return total;
	}
	private static int add(int x,int y,int z)
	{
		total=x+y+z;
		return total;
	}
	public static void main(String[] args)
	{
		x=10;
		y=20;
		z=30;
		add(x);
		System.out.println("the total :"+add(x));
		add(x,y);
		System.out.println("the total :"+add(x,y));
		add(x,y,z);
		System.out.println("the total :"+add(x,y,z));
	}
}
