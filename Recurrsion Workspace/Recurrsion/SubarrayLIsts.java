import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class SubarrayLIsts {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Integer> currentArray = new ArrayList<>();
        List<List<Integer>> lst = new ArrayList<>();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(callme(arr,0,currentArray,lst));
    }
    public static List<List<Integer>> callme(int[]arr,int currentIndex,List<Integer> currArray,List<List<Integer>> subarrays)
    {
        if(currentIndex == arr.length){
            return subarrays;
        }
        for(int i=currentIndex;i<arr.length;i++)
        {
            currArray.add(arr[i]);
            subarrays.add(new ArrayList<>(currArray));
            callme(arr,i+1,currArray,subarrays);
            currArray.remove(currArray.size()-1);
        }
        return subarrays;
    }

}
