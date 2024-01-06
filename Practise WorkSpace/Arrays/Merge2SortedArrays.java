import java.util.*;
public class Merge2SortedArrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        int size2 = sc.nextInt();
        int[] arr = new int[size];
        int[] arr2 = new int[size2];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        for(int i=0;i<size2;i++) arr2[i] =sc.nextInt();
        callme(arr,arr2);
    }
    public static void callme(int[] arr,int[] arr2)
    {
        int arr1poi=0,arr2poi=0;
        List<Integer> mergelst = new ArrayList<>();
        while(arr1poi<arr.length && arr2poi<arr2.length)
        {
            if(arr[arr1poi]<arr2[arr2poi])
            {
                mergelst.add(arr[arr1poi]);
                arr1poi++;
            }
            else if(arr[arr1poi]>arr2[arr2poi])
            {
                mergelst.add(arr2[arr2poi]);
                arr2poi++;
            }
            else {
                mergelst.add(arr[arr1poi]);
                mergelst.add(arr2[arr2poi]);
                arr1poi++;
                arr2poi++;
            }
        }
        while(arr1poi<arr.length) mergelst.add(arr[arr1poi++]);
        while(arr2poi<arr2.length) mergelst.add(arr2[arr2poi++]);

        for(Integer ls:mergelst)
            System.out.print(ls+" ");
    }
}
