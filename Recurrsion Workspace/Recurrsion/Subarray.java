import java.sql.Array;
import java.util.*;
import java.util.Scanner;

public class Subarray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        List<List<Integer>> subarrays = new ArrayList<>();
        List<Integer> currlist = new ArrayList<>();
        System.out.println(callme(0,size,arr,subarrays,currlist));
    }
    public static List<List<Integer>> callme(int currentIndex,int size,int[] arr,List<List<Integer>> subarrays,List<Integer> currlist)
    {
        if(currentIndex == size){
            return subarrays;
        }
        currlist.add(arr[currentIndex]);
        subarrays.add(new ArrayList<>(currlist));
        callme(currentIndex+1,size,arr,subarrays,currlist);
        currlist.remove(currlist.size()-1);
        callme(currentIndex+1,size,arr,subarrays,currlist);
        return subarrays;
    }

}
