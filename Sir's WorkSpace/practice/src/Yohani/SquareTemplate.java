package Yohani;

public class SquareTemplate extends TemplatePattern{
	double side =9;
	@Override
	void findPerimeter() {
		
		System.out.println("square per"+side*4);
	}

	@Override
	void findArea() {
	System.out.println("square area"+side*side);
	}
	

}
