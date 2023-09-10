package first;

import java.util.Scanner;

public class Factory {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Shapefactory shf=new Shapefactory();
		Shape shape1=shf.getshape(sc.next());
		shape1.draw();
	}
}
