import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FrequencyOrder {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) arr[i] = sc.nextInt();

        Map<Integer,Integer> mp = new LinkedHashMap<>();

        for(int num:arr){
           mp.put(num, 1 + mp.getOrDefault(num,0));
        }
       int max = Integer.MIN_VALUE;
        int element = arr[0];
        for(int num:mp.keySet()){
           if(max <= mp.get(num)){
               max = mp.get(num);
               element = num;
           }
        }
        System.out.println(element);
    }
}
