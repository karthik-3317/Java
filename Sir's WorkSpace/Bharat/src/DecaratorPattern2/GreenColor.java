package DecaratorPattern2;

public class GreenColor extends ShapeDecarator{
	GreenColor(Shape s1)
	{
		super(s1);
	}
	public void show()
	{
		s1.show();
		Green();
	}
	public void Green()
	{
		System.out.println("Adding the Green Color to Shape");
	}
}
