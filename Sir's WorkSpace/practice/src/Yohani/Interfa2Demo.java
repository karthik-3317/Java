package Yohani;

public class Interfa2Demo {
	public static void main(String [] args)
	{
		Rect r=new Shape2();
		Square s=new Shape2();
		System.out.println(r.findVolume(10, 10, 10));
		System.out.println(s.findVolume(10));
	}
}
