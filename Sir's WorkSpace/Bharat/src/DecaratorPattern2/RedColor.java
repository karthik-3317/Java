package DecaratorPattern2;

public class RedColor extends ShapeDecarator{

	RedColor(Shape s1) {
		super(s1);
	}
	public void show()
	{
		s1.show();
		Red();
	}
	public void Red()
	{
		System.out.println("Adding the Red Color to Shape");
	}

}
