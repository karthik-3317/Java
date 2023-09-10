package DecaratorPattern2;

public class ShapeDecarator implements Shape{
	public Shape s1;
	ShapeDecarator(Shape s1)
	{
		this.s1=s1;
	}
	public void show() {
//		s1.show();
	}
}
