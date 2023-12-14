import java.util.*;
public class FrequencyBasedOnK {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int [] ar;
        ar = callme(arr,k);
        for(int a:ar)
            System.out.print(a+" ");
    }
    public static int[] callme(int[] arr,int k)
    {
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hmap.put(arr[i],1+hmap.getOrDefault(arr[i],0));
        }
        System.out.println(hmap);
        // for sorting a map we need to declare a list which can iteratable
        List<Map.Entry<Integer,Integer>> entrylist = new ArrayList<>(hmap.entrySet());
        System.out.println(entrylist);
        // based on descending order
        Collections.sort(entrylist, new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> mp1, Map.Entry<Integer,Integer> mp2)
            {
                int freq = mp2.getValue().compareTo(mp1.getValue());
                if(freq == 0)
                    return mp2.getKey().compareTo(mp1.getKey());
                return freq;
            }

        });
        System.out.println(entrylist);
        int[] ans = new int[k];
        int j = 0;
        for(Map.Entry<Integer,Integer> ls:entrylist)
        {
            if(j==k) break;
            ans[j++] = ls.getKey();
        }
        return ans;
    }
}
