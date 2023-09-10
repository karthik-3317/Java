package abstraction;

public class AbstractDemo extends AbstractClass{
	static int sum;
	
	public double caluculate() {
		 sum = 90;
		return sum;
	}
	public static void main(String [] args)
	{
		System.out.println(sum);
	}
}
