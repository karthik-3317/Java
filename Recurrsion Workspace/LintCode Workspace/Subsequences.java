import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsequences {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> currentlst = new ArrayList<>();
        System.out.println(callme(0,lst,currentlst,arr));
    }

    public static List<List<Integer>> callme(int index,List<List<Integer>>lst,List<Integer> currentlst,int[] arr)
    {
        if(index >=arr.length)
        {
            lst.add(new ArrayList<>(currentlst));
            return null;
        }
        currentlst.add(arr[index]);
        callme(index+1,lst,currentlst,arr);
        currentlst.remove(currentlst.size() - 1); // Remove the last element
        callme(index+1,lst,currentlst,arr);
        return lst;
    }
}
