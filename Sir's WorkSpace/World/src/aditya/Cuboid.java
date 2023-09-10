package aditya;

public class Cuboid {

	private double l,b,h;
	public boolean setL(double l)
	{
		if(l<0)
		{
			return false;
		}
		else
		{
			this.l=l;
			return true;
		}
		
	}
	public double getL()
	{
		return l;
	}
	public boolean setB(double b)
	{
		if(b<0)
		{
			return false;
		}
		else {
			this.b=b;
			return true;
		}
		
	}
	public double getB()
	{
		return b;
	}
	public boolean setH(double h)
	{
		if(h<0)
			return false;
		else
		{
			this.h=h;
			return true;
		}
		
	}
	public double getH()
	{
		return h;
	}
	public  double getfindVolume()
	{
		return findVolume();
	}
	private double findVolume()
	{
		double area;
		area=l*b*h;
		return area;
	}
}
