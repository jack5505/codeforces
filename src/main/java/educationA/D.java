package educationA;

import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D {
    private static StringTokenizer tokenizer;
    private static BufferedReader bufferedReader;
    private static ArrayList<Integer> [] graph;

    private static boolean used[];
    private static boolean  found = false;

    public static void main(String[] args) throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int test = nextInt();
        while (test -- > 0){
            solveProblem();
        }
    }
    public static void dfs(int currentV, int searchV,int cost)
    {
        used[currentV] = true;
        if(currentV == searchV){
            found = true;
            System.out.println(cost);
            return;
        }
        for(Integer vertex : graph[currentV])
        {
            if(!used[vertex]){
                cost += Math.abs(vertex - currentV);
                dfs(vertex,searchV,cost);
            }
        }
    }

    private static void solveProblem() throws IOException
    {
        int n = nextInt();
        int query = nextInt();
        String path [] = new String[n];
        for (int i = 0; i < n; i++) {
            path[i] = next();
        }
        used = new boolean[n + 1];
        graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        Map<Character, List<Integer>> pathgraph = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            for(char j : path[i].toCharArray()) {
                pathgraph.put(j,pathgraph.getOrDefault(j,new ArrayList<>()));
                pathgraph.get(j).add(i + 1);
            }
        }
        String allCombination = "BRYG";
        for(int i = 0 ; i < allCombination.length() ;i ++)
        {
            if(pathgraph.get(allCombination.charAt(i)) != null)
            {
                List<Integer> list = pathgraph.get(allCombination.charAt(i));
                Collections.sort(list);
                for(int j = 0 ; j < list.size() - 1; j ++){
                    graph[list.get(j)].add(list.get(j + 1));
                    graph[list.get(j + 1)].add(list.get(j));
                }
            }
        }
        while (query -- > 0){
            int x, y;
            x = nextInt();
            y = nextInt();
            dfs(x,y,0);
            if(!found){
                System.out.println(-1);
            }
            used = new boolean[n + 1];
            found = false;

        }

        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(25);
        list.add(35);




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
