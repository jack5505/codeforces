package leetcode;

import java.util.Scanner;

public class MaximumSubArray {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int temp [] [] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[i][j] = cin.nextInt();
            }
        }
        System.out.println(uniquePaths(temp));
    }
    public static int uniquePaths(int grid[][])
    {
        int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0] == 1 || grid[n - 1][m - 1] == 1)
            return 0;
        int dp [] [] = new int[n][m];
        for(int i = 0 ; i < n; i ++)
        {
            if(grid[i][0] != 1) {
                dp[i][0] = 1;
            }else
                break;
        }
        for(int i = 0 ; i < m; i ++)
        {
            if(grid[0][i] != 1) {
                dp[0][i] = 1;
            }
            else
                break;
        }
        for(int i = 1 ; i < n ;i ++)
        {
            for(int j = 1 ; j < m;j ++)
            {
                if(grid[i][j] != 1){
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(dp[i][j] +" ");
//            }
//            System.out.println();
//        }
        return dp[n - 1][m - 1];

    }
}
