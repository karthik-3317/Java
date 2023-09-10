import java.util.*;

public class Frequency  {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String str = sc.nextLine();
        Map<Character,Integer> mp = new HashMap<>();
        for(char ch:str.toCharArray()){
            if(mp.containsKey(ch)){
                mp.put(ch,mp.get(ch)+1);
            }else{
                mp.put(ch,1);
            }
        }
        // printing the map
        for(char ch:mp.keySet()){
            System.out.println(ch + " " + mp.get(ch));
        }
    }
}