package aditya;
import java.util.Scanner;
public class Codechef3 
{
	static Scanner sc=new Scanner(System.in);
	public static int txc,gp,i,chef=0,carl=0,draw=0,carlown,cheflown,prize;
	 
	public static void main(String[] args)
	{
	System.out.println("enter no of text cases");
	txc=sc.nextInt();
	char current []=new char[14];
	while(txc>0)
	{
		System.out.println("enter grand prize");
		gp=sc.nextInt();
		for(i=0;i<14;i++)
		{
			current[i]=sc.next().charAt(0);
		}
		for(i=0;i<14;i++)
		{
			if(current[i]=='c')
				carl++;
			else if(current[i]=='n')
				chef++;
			else if(current[i]=='d')
				draw++;
		}
		carlown=carl*2+draw*1;
		cheflown=chef*2+draw*1;
		if(carlown>cheflown)
		{
		prize=60*gp;
		System.out.println(prize);
		}
		else if(carlown<cheflown)
		{
			prize=40*gp;
		System.out.println(prize);
		}
		else if(carlown==cheflown)
		{
			prize=55*gp;
		System.out.println(prize);
		}
		carlown=0;
		cheflown=0;
		carl=0;
		draw=0;
		chef=0;
		txc=txc--;
	}
	}
}
