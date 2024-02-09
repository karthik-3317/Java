/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class AddTwoNumbersWithString
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String append = "";
        System.out.println(addTwoNums(s1, s2,append));
    }
    static String addTwoNums(String s1, String s2,String append)
    {
       int a = 0,b=0,c=0,sum = 0;
       int t1 = s1.length()-1,t2 = s2.length()-1;
       StringBuilder sb = new StringBuilder();
       while(t1>=0 || t2>=0)
       {
           a = (t1<0) ? 0 : (s1.charAt(t1)-'0');
           b = (t2<0) ? 0 : (s2.charAt(t2)-'0');
           sum = a+b+c;
           c= sum/10;
           sb.append(sum%10);
           if(t1>=0) t1--;
           if(t2>=0) t2--;
       }
       if(c>0)
           sb.append(c);
       sb.reverse();
       return sb.toString();
    }
}
