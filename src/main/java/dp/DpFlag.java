package dp;

import java.util.Scanner;

public class DpFlag {
    /**
     * Mashina mojet sozdavat flagi s belim krasnim i sinimi poloskami
     * kajdiy flag sostoit iz n polosok
     * poloski odnogo svet ne mojit naxoditsa ryadom
     * flag ne mojit nachinatsa ili qonchatsa s siniy poloski
     *
     * reshseniya
     * sozdayom matrix leviy chast dlina polos praviy chast svet
     * @param args
     */
    public static void main(String[] args) {
       // oboznachim 0=krasniy  1=beliy 2=siniy
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int dp[][] = new int[n + 1][3];
        dp[1][0] = dp[1][1] = 1;
        for(int i = 2 ; i <= n; i++)
        {
            dp[i][0] = dp[i - 1][2];
            dp[i][1] = dp[i - 1][2];
            dp[i][2] = dp[i - 1][1] + dp[i - 1][0];
        }
        System.out.println(dp[n][0] + dp[n][1]);
    }
}
