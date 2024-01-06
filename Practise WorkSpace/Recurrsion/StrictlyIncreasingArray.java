import java.util.Scanner;

public class StrictlyIncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];

        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

       if(gradually(a,0)){
        System.out.println("True Happened");
       }
       else{
        System.out.println("Not Happened");
       }
    }
    public static boolean gradually(int[] arr,int idx)
    {
        if(idx == arr.length - 1)
        {
            return true;
        }

        if(arr[idx] > arr[idx + 1])
        return false;
        
        return gradually(arr,idx+1);
    }
}
