package Yohani;
public class Singleton {
	private static Singleton single;
	private Singleton()
	{
		System.out.println("HI ARE YOUR");
		
	}
	 static Singleton getObject()
	{
		if(single==null)
		{
			return new Singleton();
		}
		else 
			return single;
	}
}
