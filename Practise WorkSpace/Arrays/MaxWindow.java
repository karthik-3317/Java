import java.util.*;
public class MaxWindow {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        int wsize = sc.nextInt();
        callme(arr,wsize);
    }
    public static void callme(int[] arr,int wsize)
    {
        Map<Integer,Integer> hmap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i=0;i<wsize;i++)
        {
            max = Math.max(max,arr[i]);
            hmap.put(arr[i],1+hmap.getOrDefault(arr[i],0));
        }
        System.out.print(max+" ");
        for(int i=1;i<arr.length-wsize;i++)
        {
            int prev = arr[i-1];
            int next = arr[i+wsize-1];
            hmap.put(arr[i],hmap.get(prev)-1);
            if(hmap.get(prev)==0)
                hmap.remove(prev);
            max = Math.max(max,next);
            System.out.print(max+" ");
            hmap.put(arr[i],1+hmap.getOrDefault(arr[i],0));
        }
    }
}
