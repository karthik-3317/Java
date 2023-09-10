package Factory;

public class Traingle implements Shape{
	 double x=4,y=3;
	@Override
	public double findPerimeter() {
		System.out.println(x*x*y);
		return x*x*y;
	}

	@Override
	public double findArea() {
		System.out.println(x*x*y);
		return x*y*y;
	}

}
