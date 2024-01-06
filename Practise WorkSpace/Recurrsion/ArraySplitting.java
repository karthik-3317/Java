////import java.util.*;
////import java.util.Scanner;
////import java.util.Collection;
////
////public class ArraySplitting {
////    static Scanner sc = new Scanner(System.in);
////    public static void main(String[] args) {
////        int size = sc.nextInt();
////        int subarray = sc.nextInt();
////        int[] arr  = new int[size];
////        for(int i=0;i<size;i++)
////        {
////            arr[i] = sc.nextInt();
////        }
////        List<List<Integer>> lst = new ArrayList<>();
////        List<Integer> currlst = new ArrayList<>();
////        List<Integer> checkcase = new ArrayList<>();
////        callme(arr,0,size,currlst,lst);
////        for(List<Integer> l:lst)
////        {
////            int max = Integer.MIN_VALUE;
////            int min = Integer.MAX_VALUE;
////            for(int i=0;i<l.size();i++)
////            {
////                if(l.get(i)>max) max = l.get(i);
////                if(l.get(i)<min) min = l.get(i);
////            }
////            checkcase.add(max-min);
////        }
////        Collections.sort(checkcase);
////        System.out.println(checkcase);
////        for(int i=0;i<subarray;i++)
////        {
////            System.out.println(checkcase.get(i));
////        }
////
////
////    }
////
////    public static List<List<Integer>> callme(int arr[],int currentIndex,int size,List<Integer> currlst,List<List<Integer>> lst)
////    {
////        if(currentIndex == size)
////        {
////            return lst;
////        }
////
////            currlst.add(arr[currentIndex]);
////            lst.add(new ArrayList<>(currlst));
////            callme(arr,currentIndex+1,size,currlst,lst);
////            currlst.remove(currlst.size()-1);
////            callme(arr,currentIndex+1,size,currlst,lst);
////
////        return lst;
////    }
////
////}

import java.util.*;

public class ArraySplitting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int subarray = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        List<Integer> currentSubarray = new ArrayList<>();
        int maxDifference = Integer.MIN_VALUE;

        for (int i = 0; i < size - subarray + 1; i++) {
            currentSubarray.clear();
            for (int j = i; j < i + subarray; j++) {
                currentSubarray.add(arr[j]);
            }

            int max = Collections.max(currentSubarray);
            int min = Collections.min(currentSubarray);
            maxDifference = Math.max(maxDifference, max - min);
        }

        System.out.println(maxDifference);
    }
}



//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ArraySplitting {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        long[] a = new long[n];
//
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextLong();
//        }
//
//        long[] differences = new long[n - 1];
//        for (int i = 0; i < n - 1; i++) {
//            differences[i] = a[i + 1] - a[i];
//        }
//
//        Arrays.sort(differences);
//        long cost = 0;
//
//        for (int i = 0; i < n - k; i++) {
//            cost += differences[i];
//        }
//
//        System.out.println(cost);
//    }
//}
