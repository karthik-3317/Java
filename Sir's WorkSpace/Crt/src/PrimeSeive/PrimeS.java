package PrimeSeive;

import java.util.Scanner;

public class PrimeS 
{
  static int arr[]=new int[10005];
  static void checkPrime()
  {
    int n=10000;
    for(int i=0;i<=n;i++)
    {
      arr[i]=1;
    }
    arr[1]=arr[0]=0;
    
    int sq=(int)Math.sqrt(n);
    
    for(int i=2;i<=sq;i++)
      if(arr[i]==1)
        for(int j=i*i;j<=n;j=j+i)
            arr[j]=0;
  }
  public static void main(String args[])
  {
    checkPrime();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
//    if(arr[n]==1)
//      System.out.println("prime");
//    else
//      System.out.println("Not-prime");
    for(int i=0;i<=n;i++)
    {
      if(arr[i]==1)
        System.out.println("prime");
      else
        System.out.println("Not-prime");
    }
    sc.close();
    
  }
}