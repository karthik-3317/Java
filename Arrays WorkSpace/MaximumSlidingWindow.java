import java.util.Scanner;
public class MaximumSlidingWindow {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        int windowsize = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(callme(arr,windowsize));
    }
    public static int callme(int arr[],int windowsize)
    {
        int length = arr.length;
        int sum = 0;
        for(int i =0;i<windowsize;i++)
        {
            sum +=arr[i];
        }
        System.out.println(sum);
        int maxWindowSum = sum;
        for(int i=1;i<length-windowsize+1;i++)
        {
            int temp = sum;
            sum -=arr[i-1];
            sum +=arr[i+windowsize-1];
            maxWindowSum = Math.max(temp,sum);
        }
        return maxWindowSum;
    }
}
