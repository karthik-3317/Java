package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Arraylis {
	public static void main(String[]args)
	{
		ArrayList<Array> arr=new ArrayList();
		Scanner sc=new Scanner(System.in);
//		arr.add("add this if you are arraylist");  not possible because integer type
//		System.out.println(arr.get(1));
		boolean yes=true;
		while(yes)
		{
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("Add your wish");
			    int ok1,ok2,ok3;
			    ok1=sc.nextInt();
			    ok2=sc.nextInt();
			    ok3=sc.nextInt();
			    arr.add(new Array(ok1,ok2,ok3));
			    break;
			case 2:
				System.out.println("Sorting accordingly");
				Collections.sort(arr);
				break;
			case 3:
				System.out.println("Displaying something present in vector");
				for(Array u:arr)
				{
					System.out.println(u);
				}
				break;
			default:
				yes=false;
				System.out.println("You are Removed because of violation of our terms and conditions");
				break;
			}
		}
		
	}
}
