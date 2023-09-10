package week8;
import java.util.Vector;
import java.util.Collections;
import java.util.Scanner;
public class Vectors {
	public static voi7d main(String[] args)
	{
		Vector<Country> v=new Vector<>();
		Scanner sc=new Scanner(System.in);
		String name;
		boolean loop=true;
		while(loop)
		{
			System.out.println("1.add new country name 2.sort by country name 3.search by country name 4.Display");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("1.enter your country name");
				v.add(new Country(sc.next()));
				break;
			case 2:
				System.out.println("after sorting by country name");
				Collections.sort(v);
				break;
			case 3:
				System.out.println("enter your country name to search");
				name=sc.next();
				for(Country c:v)
				{
					if(c.name.compareTo(name)>=0)
						System.out.println("You got the country name");
					else
						continue;
				}
				break;
			case 4:
				for(Country c:v)
				{
					System.out.println(c);
				}
				break;
			default :
			loop=false;
			}
		}
		
	}
}
