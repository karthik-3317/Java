package aditya;

public class CmdargLine {

	public static void main(String[] args)
	{
		int i,max=0;
		for(i=0;i<args.length;i++)
		{
			if(max<Integer.parseInt(args[i]))
			{
			max=Integer.parseInt(args[i]);
		}
	}
		System.out.println("the max value of given command value arguments are "+max);
}
}
