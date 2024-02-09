import java.util.HashMap;
import java.util.*;

public class LongestNonRepeteadString {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
        System.out.println(callme(s));
    }
    public static int callme(String s)
    {
        int n = s.length();
        int ws = 0,we=0,mx=0;
        Map<Character,Integer> mp = new HashMap<>();
        for(we=0;we<n;we++)
        {
            char end = s.charAt(we);
            mp.put(end,1+mp.getOrDefault(end,0));
            if(mp.get(end)<=1)
            {
                mx = Math.max(mx,we-ws+1);
            }
            else{
                while(ws<=we)
                {
                    char rem = s.charAt(ws);
                    ws++;
                    mp.put(rem,mp.get(rem)-1);
                    if(mp.get(rem)==1) break;
                }
            }
        }
    return mx;
    }
}

// this is only works for longest substring with
