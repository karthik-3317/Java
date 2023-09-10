package Yohani;

public abstract class TemplatePattern {
	 abstract void findPerimeter();
	 abstract void findArea();
	 final void findmeasure()
	 {
		 findPerimeter();
		 findArea();
	 }
}
