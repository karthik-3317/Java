import java.util.*;
public class UniqueElementsInWindow {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        int windowsize = sc.nextInt();
        callme(arr,windowsize);
    }
    public static void callme(int[] arr,int wsize)
    {
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<wsize;i++)
        {
            hmap.put(arr[i],1+hmap.getOrDefault(arr[i],0));
        }
        System.out.print(hmap.size()+" ");
        for(int i=1;i<=arr.length-wsize;i++)
        {
            int prev = arr[i-1];
            int next = arr[i+wsize-1];
            hmap.put(prev,hmap.get(prev)-1);
            if(hmap.get(prev)==0) {
                hmap.remove(prev);
            }
            System.out.println(hmap);
            hmap.put(next,1+hmap.getOrDefault(next,0));
            System.out.print(hmap.size()+" ");
        }
    }
}
