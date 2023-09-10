import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
public class Subarray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        System.out.println();
        List<List<Integer>> subarrays = new ArrayList<>();
        System.out.println(findSubarrays(arr,0,0,lst,subarrays));
    }
    public static List<List<Integer>> callme(int[] arr, int currentIndex, int currentSum, List<Integer> lst)
    {

        List<List<Integer>> subarrays = new ArrayList<>();
        if(currentIndex == arr.length)
        {
            return subarrays;
        }
        for(int i=currentIndex;i<arr.length;i++)
        {
            lst.add(arr[i]);

        }
            return null;
    }
    public static List<List<Integer>> findSubarrays(int[] arr, int start,int count, List<Integer> current,List<List<Integer>> subarrays) {
        // Create a list to store subarrays

        System.out.println(count);
        // Base case: If the 'start' index reaches the end of the array, return an empty list
        if (start == arr.length) {
            return subarrays;
        }

        // Iterate through the array starting from the 'start' index
        for (int end = start; end < arr.length; end++) {
            // Add the current element to the 'current' list
            current.add(arr[end]);

            // Add a copy of the 'current' list to 'subarrays'
            // This represents the subarray starting from 'start' and ending at 'end'
            subarrays.add(new ArrayList<>(current));

            // Recursively find subarrays starting from the next element (end + 1)
            findSubarrays(arr, end + 1,count+1, current,subarrays);

            // Backtrack by removing the last element from 'current' to explore other possibilities
            current.remove(current.size() - 1);
        }

        // Return the list of subarrays
        return subarrays;
    }

}





