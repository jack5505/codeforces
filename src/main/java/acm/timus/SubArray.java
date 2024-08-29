package acm.timus;

import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {
        System.out.println(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED"));
//        System.out.println(exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCB"));
//        System.out.println(exist(new char[][]{{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}},"ABCEFSADEESE"));
    }

    public static int n;

    public static int m;

    public  static char [][] a;

    public static String search;

    public static String found = "";

    public static boolean [][]used;

    static int dx [] = {0, 1, 0, -1};
    static int dy [] = {1, 0, -1, 0};
    public static void search(int i, int j,String temp, int position)
    {
        used[i][j] = true;
        int N = dx.length;
        for (int k = 0; k < N ; k++)
        {
            if((i + dx[k] >=  0  &&  i + dx[k] < n) &&
                    (j + dy[k] >= 0 && j + dy[k] < m) &&
                    !used[i + dx[k]][j + dy[k]])
            {
                if(position < search.length() && search.charAt(position) == a[i + dx[k]][j + dy[k]]) {
                    search(i + dx[k], j + dy[k], temp + a[i + dx[k]][j + dy[k]],position + 1);
                }
            }
        }

        if(temp.equals(search)){
            found = temp;
            return;
        }
        used[i][j] = false;
      //  System.out.println(temp +  " " + position + " " + i + ":" + j);


    }


    public static boolean exist(char[][] board, String word) {
            n = board.length;
            m = board[0].length;
            a = board;
            search = word;
            used = new boolean[n + 1][m + 1];
            for(int i = 0 ; i < n ;i ++)
            {
                for(int j = 0 ; j < m;j ++)
                {
                    if(word.charAt(0) == a[i][j]){
                        search(i,j,"" + word.charAt(0),1);
                    }
                }
            }
            System.out.println(found);
            return found.equals(word);
    }
}
