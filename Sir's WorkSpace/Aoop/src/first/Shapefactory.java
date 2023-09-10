package first;

public class Shapefactory 
{
	public Shape getshape(String curve)
	{
		if(curve==null)
			return null;
		else if(curve.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(curve.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if(curve.equalsIgnoreCase("Square"))
			return new Square();
		return null;
	}
}
