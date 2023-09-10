package postlab;
import java.util.Scanner;                     //import scanner
public class postlab1 
{
   public static void main(String s[])
   {
     Scanner sc = new Scanner(System.in);                        
     int fact=1,i;
     System.out.println("Enter any number to find Factorial ");
     int k = sc.nextInt();                 //read k 
     for(i=1;i<=k;i++)                      // looping statement
     {
       fact=fact*i;
     }
     System.out.println("Factorial of Entered Number "+k+" Is " +fact);    //Final output
     
   }
}