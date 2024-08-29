package educationA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DSolution {
    private static StringTokenizer tokenizer;
    private static BufferedReader bufferedReader;

    public static void main(String[] args) throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int test = nextInt();
        while (test -- >0){
            int n = nextInt();
            int query = nextInt();
            solution(n,query);
        }
    }
    public static void solution(int n , int query) throws IOException {
        String path = "BGRY";
        Map<String, List<Integer>> mp = new HashMap<>();
        String [] a = new String[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = next();
            mp.put(a[i],mp.getOrDefault(a[i],new ArrayList<>()));
            mp.get(a[i]).add(i);
        }
        while (query -- > 0) {
            int x, y;
            x = nextInt();
            y = nextInt();
            x--;
            y--;
            if (check(a[x], a[y]))
            {
                System.out.println(Math.abs(x - y));
            } else {
                int ans = Integer.MAX_VALUE;
                for (int i = 0; i < path.length(); i++)
                {
                    for (int j = i + 1; j < path.length(); j++)
                    {
                        String temp = path.charAt(i) + "" + path.charAt(j);
                        List<Integer> list = mp.get(temp);
                        if (list != null)
                        {
                            if(check(temp,a[x]) && check(temp,a[y]))
                            {
                                int i1 = Collections.binarySearch(list, x);
                                i1 = Math.abs(i1) - 1;
                                if(i1 >= 0 && list.size() > i1){
                                    ans = Math.min(ans,Math.abs(list.get(i1) - x) + Math.abs(list.get(i1) - y));
                                }
                                i1--;
                                if(i1 >= 0 && list.size() > i1){
                                    ans = Math.min(ans,Math.abs(list.get(i1) - x) + Math.abs(list.get(i1) - y));
                                }
                                i1--;
                                if(i1 >= 0 && list.size() > i1){
                                    ans = Math.min(ans,Math.abs(list.get(i1) - x) + Math.abs(list.get(i1) - y));
                                }
                            }
                        }
                    }
                }
                System.out.println(ans != Integer.MAX_VALUE ? ans : -1);
            }
        }
    }
    public static <T extends Comparable<T>> int findLowerBoundIndex(List<T> list, T lowerBound) {
        if (list == null || lowerBound == null) {
            throw new IllegalArgumentException("List and lowerBound must not be null");
        }

        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            T midValue = list.get(mid);

            if (midValue.compareTo(lowerBound) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // After exiting the loop, left is the index of the first element >= lowerBound
        // Check if left is within bounds and satisfies the condition
        if (left < list.size() && list.get(left).compareTo(lowerBound) >= 0) {
            return left;
        } else {
            return -1; // No such element found
        }
    }
    public static boolean check(String x, String y){
        return (x.charAt(0) == y.charAt(0) || x.charAt(0) == y.charAt(1) || x.charAt(1) == y.charAt(0) || x.charAt(1) == y.charAt(1));
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
