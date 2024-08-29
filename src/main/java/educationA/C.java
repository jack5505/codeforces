package educationA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C {
    private static StringTokenizer tokenizer;
    private static BufferedReader bufferedReader;
    public static void main(String[] args) throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int test = nextInt();
        while (test -- > 0){
            int n = nextInt();
            int k = nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            solveOTherVariant(n, a, k);

        }
    }
    public static void solveOTherVariant(int n , Integer a[] , int k){
        Arrays.sort(a, Collections.reverseOrder());
        long ans = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0){
                ans -= a[i];
                sum += a[i - 1] - a[i];
            }else{
                ans += a[i];
            }
        }
        long found = Math.min(k,sum);
        ans -= found;
        System.out.println(ans);
    }
    public static void solve(int n , Integer a[] ,int k)
    {
        Arrays.sort(a);
        long alice = 0;
        long bob = 0;
        int i;
        if(n % 2 == 0)
        {
            for (i = 0; i < n - 1; i += 2)
            {
                int diff = a[i + 1] - a[i];
                if (diff < k)
                {
                    a[i] += diff;
                    k -= diff;
                } else {
                    if(k >= 1) {
                        a[i] += k;
                        k = 0;
                    }
                }
                if(i != 0){
                    alice += a[i - 2];
                    bob   += a[i - 1];
                }

            }
            alice += a[i - 2];
            bob   += a[i - 1];
        }else{

            for(i = n - 1 ; i >= 1 ;i -= 2)
            {
                int diff = a[i] - a[i - 1];
                if(diff < k)
                {
                    a[i - 1] += diff;
                    k -= diff;
                }else{
                    if(k >= 1) {
                        a[i - 1] += k;
                        k = 0;
                    }
                }
                if(i != n - 1) {
                    alice += a[i + 2];
                    bob   += a[i + 1];
                }
            }
            alice += a[i + 2];
            bob   += a[i + 1];
            alice += a[i];
        }
        //System.out.println(alice +" " + bob);
        System.out.println(Math.abs(alice - bob));
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
