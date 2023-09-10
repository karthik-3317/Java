package Factory;

public class Rectangle implements Shape{
	 double x=5,y=4;
	@Override
	public double findPerimeter() {
		return x+y;
	}

	@Override
	public double findArea() {
		return x+y;
		
	}

}
