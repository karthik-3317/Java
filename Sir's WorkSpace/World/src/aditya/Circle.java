package aditya;
public class Circle
{
	private double rad;
	public boolean setRadius(double rad)
	{
		if(rad<0)
			return false;
		else
		{
		this.rad=rad;
		return true;
		}
	}
	private double findArea()
	{
		double area;
		area=rad*rad*rad;
		return area;
	}
	public double getRadius()
	{
		return rad;
	}
	public double getfindArea()
	{
		return findArea();
	}
}
