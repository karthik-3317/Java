package Yohani;
public class TemplateDemo {
	public static void main(String [] args)
	{
		TemplatePattern c=new Circle();
		c.findmeasure();
		TemplatePattern r=new RectTemplate();
		r.findmeasure();
		TemplatePattern s=new SquareTemplate();
		s.findmeasure();
	}
}
