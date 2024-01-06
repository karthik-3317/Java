import java.util.Scanner;

public class SwapPositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        callme(arr,size);
    }
    public static void callme(int[] arr,int n)
    {
        int i = -1;
        int temp;
        for(int j=0;j<n;j++)
        {
          if(arr[j]<0)
          {
              i++;
              temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
          }
        }
        int pos = i+1, neg = 0;

        while (pos < n && neg < pos && arr[neg] < 0)
        {
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg += 2;
        }
        for(int k=0;k<n;k++) System.out.print(arr[k]+" ");
    }

}
