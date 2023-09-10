package Yohani;
public class Circle extends TemplatePattern{
	double r=6;
	@Override
	void findPerimeter() {
		
		System.out.println("cir per"+Math.PI*r*2);
	}

	@Override
       void  findArea() {
		System.out.println("cir are"+Math.PI*r*r);
	}
}
