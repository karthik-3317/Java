package guiProject;
import java.util.Scanner;
public class Skill52 {
	public static void main(String[] args)
	  {
	        Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int a[]=new int[n],i,j;
	      for(i=0;i<n;i++)
	        a[i]=sc.nextInt();
	      int count=0;
	      for(i=0;i<n;i++)
	      {
	        for(j=i+1;j<n;j++)
	        {
	          if(a[i]!=a[j])
	            count++;
	        }
	        count=2;
	    }
	      System.out.println(count/2+1);
	  }
	    
	}