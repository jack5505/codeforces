package div963;

import java.util.ArrayList;
import java.util.Scanner;

public class CycleDfs {
    public static ArrayList<Integer>[] ajacent;
    public static boolean [] used;
    public static int [] col;

    public static void dfs(int vertex, int par){
        col[vertex] = 1;
        for(int v : ajacent[vertex]){
            if(col[v] == 0){
                dfs(v,vertex);
            }
            else if(col[v] == 1 && par != v && par != -1){
                System.out.println("CYCLE");
                return;
            }
        }
        col[vertex] = 2;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        ajacent = new ArrayList[n];
        used = new boolean[n];
        col = new int[n];
        for (int i = 0; i < m; i++) {
            int v1 = cin.nextInt();
            int v2 = cin.nextInt();
            ajacent[v1].add(v2);
            ajacent[v2].add(v1);
        }
        for (int i = 1; i < n; i++)
        {
            if(!used[i])
            {
                dfs(i,-1);
            }
        }
    }
}
