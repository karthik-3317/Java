import java.util.*;
public class KMostFrequent {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int txt = sc.nextInt();
        while(txt-->0) callme();
    }
    public static void callme(){
        Map<String,Integer> mp = new TreeMap<>();
        int size = sc.nextInt();
        int freq = sc.nextInt();
        String now;
        for(int i=0;i<size;i++){
            now = sc.next();
            mp.put(now, 1+ mp.getOrDefault(now, 0));
        }
        for(String list:mp.keySet())
        {
            if(freq >0){
                System.out.println(list);
            }
            freq--;
        }
    }

}
