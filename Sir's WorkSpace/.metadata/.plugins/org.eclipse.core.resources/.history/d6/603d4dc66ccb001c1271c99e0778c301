package stringTokinser;
import java.util.StringTokenizer;
public class Stop {
	String month;
	public static void main(String[] args)
	{
		Stop st=new Stop();
		st.month="10/23/2003";
		StringTokenizer stt=new StringTokenizer(st.month,"/");
		int t,i=0;
		t=stt.countTokens();
		String arr[]=new String[t];
		while(stt.hasMoreElements())
		{
			arr[i++]=stt.nextToken();
		}
		for(i=0;i<t;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
