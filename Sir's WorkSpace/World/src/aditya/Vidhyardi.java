package aditya;

public class Vidhyardi {
	double r1,r2;
	 Vidhyardi()
	{
		r1=30;
		r2=10;
	}
	public boolean setrad(double r1, double r2)
	{
		if((r1-r2)!=20)
		{
			return false;
		}
		else
		{
			this.r1=r1;
			this.r2=r2;
			return true;
		}
		
	}
	double findArea()
	{
		return Math.PI*(r1*r1-r2*r2);
	}
	
	}

