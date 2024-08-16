package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class EasyGoing {
    private static StringTokenizer st;
    private static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int test = nextInt();
        while (test -- > 0){
            int n    = nextInt();
            int temp;
            int a [] = new int[n];
            Map<Integer,Integer> cnt = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
                cnt.put(a[i],cnt.getOrDefault(a[i],0) + 1);
            }
            StringBuilder ans = new StringBuilder();
            for(int i = 0 ; i < n;i ++){
                ans.append(cnt.get(a[i]));
            }
            cnt.values().forEach(System.out::println);

            int m = nextInt();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                list.add(next());
            }
            solve(n,ans,list,a);

        }

    }

    public static void solve(int n ,StringBuilder ans, List<String> list,int a[]){

        for(String item : list)
        {
            if(item.length() == n)
            {




            }else{
                System.out.println("NO");
            }
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
        while (st==null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }


}
