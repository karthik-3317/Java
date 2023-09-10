package exceptionHandling;
import java.util.Scanner;
public class EngineDemo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your attributes ");
		Engine obj =new Engine();
		System.out.println("enginetype");
		try
		{
			obj.setengineType(sc.next());
		}
		catch(ExceptionHandleName e)
		{
			System.out.println(e);
		}
		System.out.println("enginehorse");
		try
		{
			obj.setengineHorse(sc.nextInt());
		}
		catch(ExceptionHandleHorsePower e)
		{
			System.out.println(e);
		}
		System.out.println("engine Weight");
		try
		{
			obj.setengineWeight(sc.nextDouble());
		}
		catch(ExceptionHandleWeight e)
		{
			System.out.println(e);
		}
		System.out.println("engineid");
		try
		{
			obj.setId(sc.nextInt());
		}
		catch(ExceptionHandleId e)
		{
			System.out.println(e);
		}
		System.out.println(obj);
		sc.close();
	}
}
