package Yohani;

public class NonStaticNestedClass 
{
	class Ninner
	{
		void getPrint()
		{
			System.out.println("this is the inner class object");
		}
	}
	void getPrintouter()
	{
		System.out.println("this is the outer class object");
	}
	
	public static void main(String [] args)
	{
		NonStaticNestedClass ou=new NonStaticNestedClass();
		Ninner in=ou.new Ninner();
		in.getPrint();
		ou.getPrintouter();
	}
}
