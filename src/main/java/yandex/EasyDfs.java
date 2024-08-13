package yandex;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class EasyDfs {
    private static StringTokenizer st;
    private static BufferedReader br;
    private static PrintWriter pw;
    public static boolean[] used;
    public static ArrayList<Integer>[] graph;
    public static List<Integer> ans = new ArrayList<>();
    public static void dfs(int currentV){
        used[currentV] = true;
        ans.add(currentV);
        for(int v : graph[currentV]){
            if(!used[v]){
                dfs(v);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> lines =  br.lines().toList();
        int ans = 0;
        for(String item : lines){
            item += " ";
            ans += item.split(" ").length;
        }
        System.out.println(ans);




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
