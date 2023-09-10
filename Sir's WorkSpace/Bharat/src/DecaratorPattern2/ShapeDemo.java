package DecaratorPattern2;

public class ShapeDemo {

	public static void main(String[] args) {
		Circle c=new Circle();
		Traingle t=new Traingle();
		Shape s0=new RedColor(c);
		Shape s1=new GreenColor(c);
	    Shape s2=new RedColor(t);
		System.out.println("Adding the Red Color");
		s0.show();
		System.out.println("Adding the Green Color");
		s1.show();
		System.out.println("Adding the Red Color to Traingle");
		s2.show();
	}

}
