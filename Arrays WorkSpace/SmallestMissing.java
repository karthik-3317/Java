import java.util.*;
public class SmallestMissing {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        System.out.println(callme(arr));
    }
    public static int callme(int[]arr)
    {
        int excepted = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]+1!=1&&i==0) return excepted;
            if(arr[i+1]-arr[i]!=1) return excepted+1;
            excepted +=1;
        }
        return excepted+1;
    }
}
