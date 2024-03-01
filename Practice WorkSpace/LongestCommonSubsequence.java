import java.util.*;
class SolutionLcs{
        int dp[][] = new int[10001][10001]; // constraints
        public int lcs(String str1,String str2){
            for(int[] a: dp){
                Arrays.fill(a,-1);
            }
            return helper(str1,str2,0,0);
        }
//        i = index of start char in str1
//        j = index of start char in str2
        public int helper(String str1,String str2,int i,int j){
            if(i>=str1.length()  ||  j >= str2.length()) return 0; // either str1 is empty str2 is empty or both are empty
            if(dp[i][j]!=-1) return dp[i][j];
            if(str1.charAt(i)==str2.charAt(j)) return dp[i][j] = 1 + helper(str1,str2,i+1,j+1);
            int op1 = helper(str1,str2,i,j+1);
            int op2 = helper(str1,str2,i+1,j);
            return dp[i][j] = Math.max(op1,op2);
        }
    }
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        SolutionLcs sol = new SolutionLcs();
        System.out.println(sol.lcs(str1,str2));
    }

}
