package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class NareshSMDemo {

	public static void main(String[] args) {
		ArrayList<NareshSM> a=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		boolean loop=true;
		while(loop)
		{
			System.out.println("1.add movies names 2.display 3.sort by movie name //other exit");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("enter movie name");
				a.add(new NareshSM(sc.next()));
				break;
			case 2:
				for(NareshSM u:a)
				{
					System.out.println(u);
				}
				break;
			case 3:
				System.out.println("sort by movie name is done");
				Collections.sort(a);
				break;
				default :
					loop=false;
			
			}
		}
	}

}
