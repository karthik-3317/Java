import  java.util.*;
public class DailerToString {
    static String [] options = {};
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        String num = "234";
        List<String> ans = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        helper(num,path,ans,0);
    }
    public static void helper(String num,StringBuilder path, List<String> ans , int i){
        if(path.length() == num.length()){
            ans.add(path.toString());
            return;
        }
        int n = num.charAt(i) - '0';
        for (char ch:options[i].toCharArray()){
            path.append(ch);
            helper(num,path,ans,i+1);
            path.setLength(path.length()-1);
        }
    }
}
