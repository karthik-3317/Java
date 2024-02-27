import java.util.*;
public class LongestPalindromeSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(maxPalindromicLength(s));
        System.out.println(maxPalindromeString(s));
    }
//    public static int maxPalindromicLength(String str){
//        if(str.isEmpty()) return 0;
//        if(str.length() == 1) return 1;
//        StringBuilder maxstr = new StringBuilder();
//        int max = 1;
//        for(int i=0;i<str.length();i++){
//             int ans1 = grow(str,i,i);
//             max = Math.max(max,ans1);
//
//             int ans2 = grow(str,i,i+1);
//             max = Math.max(max,ans2);
//
//        }
//        System.out.println(maxstr.toString());
//        return max;
//    }
    public static String maxPalindromeString(String str){
        int n = str.length();
        if(n==0) return "";
        if(n==1) return str;
        int mx = 0;
        int ansi = -1;
        int ansj = -1;
        for (int i = 0; i < n; i++) {
            int ans1 = grow(str,i,i);
            if(ans1>mx){
                ansi = i;
                ansj = i;
                mx = ans1;
            }
            int ans2 = grow(str,i,i+1);
            if(ans2>mx){
                ansi = i;
                ansj = i+1;
                mx = ans2;
            }
        }
       if(ansi == ansj)
        return str.substring(ansi-mx/2,ansi+mx/2+1);
       else
           return str.substring(ansi-mx/2+1,ansj+mx/2);
    }

    public static int grow(String str,int i,int j){
        if(i<0 || j<0 || i>=str.length() || j>=str.length()) return 0;
        int ans = 1;
        if(i!=j){
            if(str.charAt(i)==str.charAt(j)){
                ans = 2;
            }
            else {
                return 0;
            }
        }
        while(i-1>=0 && j+1<str.length() && str.charAt(i-1)==str.charAt(j+1)){
            i = i-1;
            j = j+1;
            ans +=2;
        }
        return ans;
    }
}
