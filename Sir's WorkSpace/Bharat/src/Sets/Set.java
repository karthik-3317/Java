package Sets;

import java.util.HashSet;

import Arraylist.Array;

public class Set {
	public static void main(String[]args)
	{
	HashSet set=new HashSet();
	set.add(12);
	set.add(new Array(2,3,5));
	set.add(new Array(2,3,5));
	System.out.println(set);
	}
	
}
