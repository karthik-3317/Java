package aditya;
public class HelloWorld
{
	static double r2,r1;
	static double findArea()
	{
		return Math.PI*r1*r1;
	}
	static double finArea()
	{
		return Math.PI*r2*r2;
	}
	static double findAreaofRing()
	{
		return findArea()-finArea();
	}
}