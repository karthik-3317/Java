import java.util.*;
public class CoinsChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ws = sc.nextInt();
        int wallet[] = new int[ws];
        for(int i=0;i<ws;i++){
            wallet[i] = sc.nextInt();
        }
        int qs = sc.nextInt();
        int quries[] = new int[qs];
        int targetMax = Integer.MIN_VALUE;
        for(int i=0;i<qs;i++){
            int temp = sc.nextInt();
            quries[i] = temp;
            targetMax = Math.max(targetMax,quries[i]);
        }
        int dp[][] = new int[ws+1][targetMax+1];
        for(int i=0;i<=ws;i++){
            Arrays.fill(dp[i],0);
        }
        for(int i=0;i<=ws;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<=ws;i++){
            for(int j=1;j<=targetMax;j++){
                dp[i][j] += dp[i-1][j];
                int current_coin = wallet[i-1];
                if(j>=current_coin){
                    dp[i][j] +=dp[i][j-current_coin];
                }
            }
        }
        System.out.println("Printing the Ways for each Queries");
        for(int i:quries){
            System.out.println(dp[ws][i]);
        }
    }
}
