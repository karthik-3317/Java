import java.util.*;
public class ReorderAccIndexArr {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] ind = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        for(int i=0;i<size;i++) ind[i] = sc.nextInt();
        callme(arr,ind,size);
    }
    public static void callme(int[] arr,int[]ind,int size)
    {
        int i = -1;
        int temp;
        int[] newarr = new int[size];
        for(int j=0;j<size;j++)
        {
            temp = ind[j];
            i++;
            newarr[i] = arr[temp];
        }
        System.out.println("After Reorder the Array");
        for(int e:newarr)
            System.out.print(e+ " ");
    }
}
