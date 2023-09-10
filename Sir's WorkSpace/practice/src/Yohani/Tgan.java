package Yohani;

//import aditya.Tgan;

public class Tgan {
	private static Tgan jio=null;
	private static int first;
	private Tgan()
	{
		first=90;
		System.out.println("This is first pattern among all. first = "+first);
	}
	public static Tgan getInstance()
	{
		if(jio==null)
		return new Tgan();
		else
			return jio;
	}
}
