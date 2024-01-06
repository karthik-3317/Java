import java.util.*;
import java.util.Scanner;

public class TargetInSubarrays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
            int size = sc.nextInt();
            int target = sc.nextInt();
            int arr[] = new int[size];
            for(int i=0;i<size;i++) arr[i] = sc.nextInt();
            List<Integer> lst = new ArrayList<>();
            callme(arr,size,lst,0,0,target);
    }
    public static void callme(int[] arr,int size,List<Integer> lst ,int ind,int sum,int target)
    {
        if(ind == size)
        {
            if(sum == target) {
                for (Integer ls : lst)
                    System.out.print(ls+" ");
            System.out.println();
            }
                return;
        }
        sum +=arr[ind];
        lst.add(arr[ind]);
        callme(arr,size,lst,ind+1,sum,target);
        sum -=arr[ind];
        lst.remove(lst.size()-1);
        callme(arr,size,lst,ind+1,sum,target);
    }
}
