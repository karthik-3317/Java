import java.util.*;

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(minWin(s,t));
    }
    public static String minWin(String s,String t)
    {
        if(s.length() < t.length()) return " ";
        // Declare a freqMap table and fill it with freq of t's chars
        Map<Character,Integer> freqmap = new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            freqmap.put(ch,1+freqmap.getOrDefault(ch,0));
        }
        int stillNeed = freqmap.size();
        int ws=0,we=0,ans_ws=-1, ans_we=-1;
        int mn = Integer.MAX_VALUE;
        for(we=0;we<=s.length();we++)   // Growing Loop
        {
            char endCh = s.charAt(we);   // include end element
            if(freqmap.containsKey(endCh)){
                freqmap.put(endCh,freqmap.get(endCh)-1);
                if(freqmap.get(endCh)==0) // good window
                {
                    stillNeed--;

                    if(we-ws+1<mn)
                    {
                        mn = we-ws+1;
                        ans_we = we;
                        ans_ws = ws;
                    }
                    // Shrink it - make it bad again
                    while(ws<=we)
                    {
                        char rem = s.charAt(ws); ws++;
                        if(freqmap.containsKey(rem))
                        {
                            freqmap.put(rem,1+freqmap.get(rem));
                            if(freqmap.get(rem)==1)
                            {
                                stillNeed++;
                                break;
                            }
                        }
                        if(we-ws+1<mn)
                        {
                            mn = we-ws+1;
                            ans_we = we;
                            ans_ws = ws;
                        }
                    }
                }
            }
        }
        if(ans_we==-1)
            return "";
        return s.substring(ans_ws,ans_we+1);
    }
}
