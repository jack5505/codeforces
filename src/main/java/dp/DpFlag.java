package dp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DpFlag {
    /**
     * Mashina mojet sozdavat flagi s belim krasnim i sinimi poloskami
     * kajdiy flag sostoit iz n polosok
     * poloski odnogo svet ne mojit naxoditsa ryadom
     * flag ne mojit nachinatsa ili qonchatsa s siniy poloski
     *
     * reshseniya
     * sozdayom matrix leviy chast dlina polos praviy chast svet
     */
    // RBG
    public static int ans = 0;
    public static Set<String> unique = new HashSet<>();
    public static void recursiveSolve(String s,int n)
    {
        if(s.length() >= n)
        {
            if(s.charAt(0) != 'B' && s.charAt(s.length() - 1) != 'B')
            {
                boolean found = true;
                for (int i = 0; i < s.length() - 1; i++) {
                    found &= (s.charAt(i) != s.charAt(i + 1));
                }
                if(found) {
                    unique.add(s);
                    System.out.println(s);
                }
            }
            return;
        }

        recursiveSolve( s + 'G', n);
        recursiveSolve( s + 'B', n);
        recursiveSolve( s + 'R', n);
    }

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
        System.out.println(dp[n][2]);
        System.out.println(dp[n][0] + dp[n][1]);
        recursiveSolve("",n);
        System.out.println(unique.size());

    }
}
