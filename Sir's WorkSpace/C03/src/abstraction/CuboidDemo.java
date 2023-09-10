package abstraction;

public class CuboidDemo {
	public static void main(String[] args)
	{
		Shape obj=new Cuboid();
		obj.b=45;
		obj.l=36;
		obj.h=21;
		obj.findVolume();
		System.out.println(obj);
	}
}
