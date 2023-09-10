package Yohani;
public class Singleton4 
{
	private static Singleton4 kalyan;
	private Singleton4()
	{
		System.out.println("This is private constructor");
	}
	public static Singleton4 getObj()
	{
		if(kalyan==null)
		{
			return new Singleton4();
		}
		else
			return kalyan;
	}
	Singleton4 ob=new Singleton4();
	System.out.println(ob);
}
