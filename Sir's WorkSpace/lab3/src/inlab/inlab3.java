package inlab;
import java.util.*;
public class inlab3 {
      public static void main(String args[]) throws Exception
      {
         Scanner sc =new Scanner(System.in);
         int n=sc.nextInt();
         int p=sc.nextInt();
         if(n>0&&p>0)
         {
           int pow=(int) Math.pow(n, p);
           System.out.println(pow);
         }
         else if(p==0||n==0)
         {
           throw new Exception("n and p should not be zero.");
         }
         else if(n<0||p<0)
         {
           throw new Exception("n or p should not be negative.");
         }
      }
}