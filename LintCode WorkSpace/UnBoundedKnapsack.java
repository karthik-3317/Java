import java.util.Scanner;

public class UnBoundedKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int vals[] = new int[n];
        int wts[] = new int[n];
        for(int i=0;i<n;i++){
            vals[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            wts[i] = sc.nextInt();
        }
        int cap = sc.nextInt();
        int dp[] = new int[cap+1];
        dp[0] = 0;
        for(int i=1;i<=cap;i++){
            for(int j=0;j<wts.length;j++){
                int val = vals[j];
                if(i>=val){
                    dp[i] = Math.max(dp[i],dp[i-vals[j]]+wts[j]);
                }
            }
        }
        for(int i=0;i<cap+1;i++){
            System.out.print(dp[i]+" ");
        }
    }
}
