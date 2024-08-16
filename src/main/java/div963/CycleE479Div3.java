package div963;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CycleE479Div3 {
    public static ArrayList<Integer> vertex [];
    public static boolean used[];
    public static List<Integer> visited = new ArrayList<>();
    public static void  dfs(int v){
        used[v] = true;
        visited.add(v);
        for(int nextV : vertex[v]){
            if(!used[nextV]){
                dfs(nextV);
            }
        }

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        vertex = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            vertex[i] = new ArrayList<>();
        }
        used = new boolean[n + 1];
        int deg[] = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int v1 =cin.nextInt();
            int v2 = cin.nextInt();
            vertex[v1].add(v2);
            vertex[v2].add(v1);
            deg[v1] ++;
            deg[v2] ++;
        }
        int ans = 0;
        for(int i = 1  ;i <= n; i++)
        {
            if(!used[i]){
                visited.clear();
                dfs(i);
                visited.forEach(integer -> {
                    System.out.print(integer  + " ");
                });
                System.out.println();
                boolean check = true;
                for(int vis : visited) check &= deg[vis] == 2;
                if(check)
                    ans ++;
            }
        }
        System.out.println(ans);

    }
}
