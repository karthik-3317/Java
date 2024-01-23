import java.util.Scanner;

public class ZeroOneKnapSack {
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
        int dp[][] = new int[n+1][cap+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0) dp[0][j] = 0;
                else if(j==0) dp[i][0] = 0;
                else {
                    int val = vals[i-1];
                    int wgt = wts[i-1];
                    if(j>=val){
                        int notbat = dp[i-1][j];
                        if(notbat>=wgt+dp[i-1][j-val]){
                            dp[i][j]=notbat;
                        }
                        else{
                            dp[i][j]=wgt+dp[i-1][j-val];
                        }
                    }
                    else {
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
