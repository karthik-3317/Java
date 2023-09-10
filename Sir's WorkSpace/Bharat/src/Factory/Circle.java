package Factory;

public class Circle implements Shape{
	 double x=7,y=9;
	@Override
	public double findPerimeter() {
		System.out.println(x*y);
		return x*y;
		
	}

	@Override
	public double findArea() {
		System.out.println(x*y);
		return x*y;
		
	}

}
