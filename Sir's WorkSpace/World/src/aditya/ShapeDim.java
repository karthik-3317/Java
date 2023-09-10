package aditya;
import java.util.Scanner;
public class ShapeDim {
	private double r,h;
	private int s;
	private float l,b;
	double findArea(double r)
	{
		return r;
	}
	int findArea(int s)
	{
		return s;
	}
	float findArea(float l,float b)
	{
		return l*b;
	}
	double findArea(float b,double h)
	{
		return b*h;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ShapeDim s=new ShapeDim();
		System.out.println("enter your values");
		s.findArea(sc.nextInt());
		System.out.println(s.findArea());
	}
}
