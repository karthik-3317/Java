import java.util.Scanner;

public class MergeSort
{
        static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int txt = sc.nextInt();
        while(txt-->0)
        {
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int i=0;i<size;i++)
                arr[i] = sc.nextInt();
            callme(arr);
        }
    }
    public static void callme(int[] arr)
    {
//        mergeSort(arr,0,arr.length-1);
    }

    public static mergeSort(int[] arr,int low,int high)
    {

    }

}
