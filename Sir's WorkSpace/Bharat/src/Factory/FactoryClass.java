package Factory;

public class FactoryClass {
	public Shape getOject(String str)
	{
		String yes=str;
		if(str=="Circle")
			return new Circle();
		if(str=="Rectangle")
			return new Rectangle();
		if(str=="Traingle")
			return new Traingle();
		else
			return null;
	}
}
