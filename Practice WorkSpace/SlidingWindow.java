import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class SlidingWindow
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
       int size=sc.nextInt();
       int windowsize=sc.nextInt();
       int[] arr = new int[size];
       for(int i=0;i<size;i++) arr[i] = sc.nextInt();
//        System.out.println("The Max WindowSum");
//       maxWindowSum(arr,windowsize);
//        System.out.println("The Min WindowSum");
//        minWindowSum(arr,windowsize);
        System.out.println("countofEvenNumbersinEachWindow");
        countofEvenNumbersinEachWindow(arr,windowsize);

    }
    public static void maxWindowSum(int[]a,int k)
    {
        int n = a.length;
        int si = 0;
        int ei = k-1;
        long sum = 0;
        long max = Integer.MIN_VALUE;
        for(int i=0;i<k;i++) sum +=a[i];

        for(int ws=1; ws<n-k+1;ws++)
        {
            sum = sum - a[ws-1] + a[ws+k-1];
            max = Math.max(max,sum);
            si = ws; ei = ws+k-1;
        }
        System.out.println(max+" "+si+" "+ei);
    }
    public static void minWindowSum(int[]a,int k)
    {
        int n = a.length;
        int si = 0;
        int ei = k-1;
        long sum = 0;
        long min = Integer.MAX_VALUE;
        for(int i=0;i<k;i++) sum +=a[i];

        for(int ws=1; ws<n-k+1;ws++)
        {
            sum = sum - a[ws-1] + a[ws+k-1];
            min = Math.min(min,sum);
            si = ws; ei = ws+k-1;
        }
        System.out.println(min+" "+si+" "+ei);
    }

    public static void countofEvenNumbersinEachWindow(int []a,int k)
    {
        int n = a.length;
        List<Integer> ans = new ArrayList<>();
        int count = 0;

        for(int i=0;i<k;i++)
        {
            if(a[i]%2==0) count++;
        }
        ans.add(count);
        for(int ws=1;ws<n-k+1;ws++)
        {
            if(a[ws-1]%2 == 0) count--;
            if(a[ws+k-1]%2 == 0) count++;
            ans.add(count);
        }
        for(Integer ls:ans) System.out.print(ls + " ");
    }



}
