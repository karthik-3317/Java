package aditya;

public class Traingle {
	private double side1,side2,side3;
	private double findArea()
	{
		double s,ar;
		s=side1+side2+side3/3;
		ar=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return ar;
	}
	public boolean setSide1(double side1)
	{
		if(side1<0)
			return false;
		else
		{
		this.side1=side1;
		return true;
		}
	}
	public double getSide1()
	{
		return side1;
	}
	public boolean setSide2(double side2)
	{
		if(side2<0)
			return false;
		else
		{
		this.side2=side2;
		return true;
	   }
	}
	public double getSide2()
	{
		return side2;
	}
	public boolean setSide3(double side3)
	{
		if(side3<0)
		{
			return false;
		}
		else
		{
		this.side3=side3;
		return true;
		}
	}
	public double getSide3()
	{
		return side3;
	}
	public double getfindArea()
	{
		return findArea();
	}
}
