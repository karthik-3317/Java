import java.util.Scanner;

public class ReverseAnArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        callme(0,arr.length-1,arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void callme(int i,int j,int[] arr)
    {
        if(j == arr.length/2){
//            for(int x:arr){
//                System.out.print(x+" ");
//            }
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        callme(i+1,j-1,arr);
    }
}
