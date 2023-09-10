package Yohani;
public class RectTemplate extends TemplatePattern{
	double l=8;
	double b=9;
	@Override
	void findPerimeter() {
		
		System.out.println("rect per"+2*(l*b));
	}

	@Override
	void findArea() {
		
		System.out.println("rect area"+l*b);
	}
	
}
