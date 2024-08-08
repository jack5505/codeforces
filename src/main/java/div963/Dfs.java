package div963;

import java.util.ArrayList;
import java.util.Scanner;

public class Dfs {

    public static ArrayList<Integer>[] ajacent;
    public static boolean [] used;


    public static void dfs(int start){
        System.out.println("vertex in " + start);
        used[start] = true;
        for(int to : ajacent[start]){
            if(!used[to]){
                dfs(to);
            }
        }
        System.out.println("vertex out :" + start);
    }


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();

        ajacent = new ArrayList[n + 1];
        used = new boolean[n + 1];
        for (int i = 0; i <= n ; i++) {
            ajacent[i] = new ArrayList<>();
        }
        for (int i = 0; i < m ; i++) {
            int v1 = cin.nextInt();
            int v2 = cin.nextInt();

            ajacent[v1].add(v2);
            ajacent[v2].add(v1);
        }
        int start = cin.nextInt();
        dfs(start);




    }
}
