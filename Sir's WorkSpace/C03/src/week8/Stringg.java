package week8;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Stringg {
	static String name;
	public static void main(String [] args)
	{
		name="my name is karthika venkata sudha sai pavan aditya your are my mla mla means the things that u are thinking but it has a meaning different that is my lovely angle";
		StringTokenizer st=new StringTokenizer(name,"p ");
		int y=st.countTokens();
		String s[]=new String[y];
		int i=0;
		while(st.hasMoreElements())
		{
			s[i++]=st.nextToken();
		}
		Arrays.sort(s);
		for(String suv:s)
		{
			System.out.println(suv);
		}
		}
}
