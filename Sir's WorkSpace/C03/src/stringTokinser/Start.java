 package stringTokinser;
import java.util.StringTokenizer;
public class Start {
	String text;
	public static void main(String[]args)
	{
		Start st=new Start();
		st.text="my name is karthik venkat sudha sai pavan aditya";
		StringTokenizer stt=new StringTokenizer(st.text," ");
		System.out.println(stt.countTokens());
		int t,i=0,j;
		t=stt.countTokens();
		String arra[]= new String[t];
		String temp;
		while(stt.hasMoreElements())
		{
			arra[i++]=stt.nextToken();
		}
		
		for(i=1;i<t;i++)
		{
			for(j=0;j<t-i;j++)
			{
				if(arra[j].compareTo(arra[j+1])>=0)
				{
					temp=arra[j];
					arra[j]=arra[j+1];
					arra[j+1]=temp;
				}
			}
		} 
		
		for(i=0;i<t;i++)
			System.out.println(arra[i]);
		
	}
}
