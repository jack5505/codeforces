package codeforces;

import java.util.Scanner;

public class A {
    static char rep []  = {'a','b','c'};
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0){
            int n = cin.nextInt();
            int m = cin.nextInt();
            char a [][] = new char[n + 1][m + 1];
            String s;
            for (int i = 1; i <= n; i++) {
                s = cin.next();
                for(int j = 1 ;j <= m ;j ++){
                    a[i][j] = s.charAt(j - 1);
                }
            }
            solve(n, m, a);
        }
    }
    public static void solve(int n ,int m, char a [] []){
        int ans = 0;
        for (int x = 1; x <= n ; x ++)
        {
            for (int y = 1; y <= m; y++)
            {
                if(a[x][y] == '*')
                {
                          int k = 1;
                          while (k < x &&
                                  k < y &&
                                  y -  k <= x + k  &&
                                  x + k  <= y + k )
                          {
                              k++;
                          }
                          System.out.println("x=" + x  +" y=" + y  + " ans= " + k);
                          ans += k;
                }
            }
        }
        System.out.println(ans);
    }
}
