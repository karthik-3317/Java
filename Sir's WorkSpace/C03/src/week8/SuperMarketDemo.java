package week8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class SuperMarketDemo {
	public static void main(String[] args) {
		LinkedList<SuperMarket> l=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		boolean loop=true;
		while(loop)
		{
			System.out.println("1.add new customer details  2. sort the details in cost 3. display");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("1.name 2.id 3.cost");
				l.add(new SuperMarket(sc.next(),sc.nextInt(),sc.nextInt()));
				break;
			case 2:
				System.out.println("sorted according to costs");
				Collections.sort(l);
				break;
			case 3:
				for(SuperMarket g:l)
				{
					System.out.println(g);
				}
				break;
				default :
					loop=false;
			}
		}

	}

}
