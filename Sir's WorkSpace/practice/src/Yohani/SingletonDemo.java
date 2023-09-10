package Yohani;
public class SingletonDemo {
	public static void main(String[]args)
	{
		Singleton single =Singleton.getObject();
		System.out.println(Singleton.getObject());
	}
}
