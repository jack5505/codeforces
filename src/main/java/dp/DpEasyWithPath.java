package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DpEasyWithPath {
    private static StringTokenizer tokenizer;
    private static BufferedReader bufferedReader;

    public static void main(String[] args) throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = nextInt();
        int a [] = new int[n + 1];
        for (int i = 1; i <= n ; i++) {
            a[i] = nextInt();
        }
        int dp [] = new int[n + 1];
        int from[] = new int[n + 1];
        dp[1] = a[1];
        for(int i = 2 ; i <= n;i ++)
        {
            dp[i] = dp[i - 1] + a[i];
            from[i] = i - 1;
            if(dp[i] < dp[i - 2] + a[i])
            {
                dp[i] = dp[i - 2] + a[i];
                from[i] = i - 2;
            }
        }
        int start = n;
        while (start >= 1){
            System.out.println(a[start]);
            start = from[start];
        }

    }
    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    private static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    private static String next() throws IOException {
        while (tokenizer == null || !tokenizer.hasMoreTokens())
            tokenizer = new StringTokenizer(bufferedReader.readLine());

        return tokenizer.nextToken();
    }
}
