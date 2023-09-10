package karthik;

public class Rectangle {
	static double side1;
	static double side2;
	static double findArea(double side1)
	{
		return side1*side1;
	}
	static double findArea(double side1,double side2)
	{
		return side1*side2;
	}
	public static void main(String[] args)
	{
		System.out.println("the area of square"+findArea(10));
		System.out.println("the area of square"+findArea(10,20));
	}
}
