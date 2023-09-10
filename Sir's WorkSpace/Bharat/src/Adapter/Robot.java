package Adapter;
import java.util.Random;
public class Robot {
	static Random ran=new Random();
	public static void smashWithHands()
	{
		System.out.println("The damage done by Robot "+ ran.nextInt(10)+1);
	}
	public static void walkForward()
	{
		System.out.println("The Steps walked by Robot "+ ran.nextInt(10)+1);
	}
	public static void robotName(String name)
	{
		System.out.println("The name of the Robot "+ran.nextInt(10)+1);
	}
}
