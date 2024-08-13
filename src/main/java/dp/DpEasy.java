package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DpEasy {
    private static StringTokenizer tokenizer;
    private static BufferedReader bufferedReader;

    public static void main(String[] args) throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        int dp [] = new int[n];
        dp[0] = a[0];
        dp[1] = a[1];
        for(int i = 2 ; i < n; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2]) + a[i];
        }
        System.out.println(dp[n - 1]);
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
