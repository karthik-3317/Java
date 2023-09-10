package Yohani;

public class Shape2 implements Square{
	public double findVolume(double l,double b,double h) {
		return l*b*h;
	}
	public double findVolume(double side)
	{
		return side*side;
	}
}