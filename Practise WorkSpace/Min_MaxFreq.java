import java.util.*;
public class Min_MaxFreq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> mp = new LinkedHashMap<>();
        int mxFq = 0 , mnFq = Integer.MAX_VALUE;

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++) arr[i] = sc.nextInt();

        for(int num:arr){
            mp.put(num, 1 + mp.getOrDefault(num,0));
        }

        for(int key:mp.keySet()){
            mxFq  = Math.max(mxFq,mp.get(key));
            mnFq  = Math.min(mnFq,mp.get(key));
        }
        System.out.println(mxFq - mnFq);
    }
}
