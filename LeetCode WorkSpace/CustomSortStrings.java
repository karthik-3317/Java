import java.util.*;
public class CustomSortStrings {
    public static void main(String[] args) {
        SolutionCustomSortStrings SolutionCustomSortStrings = new SolutionCustomSortStrings();

        // Example usage
        String order = "cba";
        String s = "abcdabc";
        String result = SolutionCustomSortStrings.customSortString(order, s);

        System.out.println("Custom sorted string: " + result);
    }
}
class SolutionCustomSortStrings {
    public String customSortString(String order, String s) {
        Map<Character,Integer> hmapS = new TreeMap<>();
        for(char ch: s.toCharArray()){
            hmapS.put(ch, 1+ hmapS.getOrDefault(ch,0));
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:order.toCharArray()){
            if(hmapS.containsKey(ch)){
                int it = hmapS.get(ch);
                while(it-->0){
                    sb.append(ch);
                }
                hmapS.put(ch,0);
            }
        }
        for(char h : hmapS.keySet()){
            if(hmapS.get(h)>=1){
                int it = hmapS.get(h);
                while(it-->0){
                    sb.append(h);
                }
                hmapS.put(h,0);
            }
        }
        return sb.toString();
    }
}
