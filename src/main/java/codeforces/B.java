package codeforces;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0){
            int n = cin.nextInt();
            int m = cin.nextInt();
            char a [][] = new char[n][m];
            for(int i = 0 ; i < n ;i ++){
                String s = cin.next();
                a[i] = s.toCharArray();
            }
            solve(a,n,m);

        }
    }
    public static void solve(char a[][],int n,int m)
    {
        int dp[][] = new int[n + 1][m + 1];
        int ans = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                int temp  = 1;
                if(a[i][j] == '*')
                {
                    int posx = i;
                    int posy = j;
                    int startR = temp;
                    int startL = -1;
                    boolean notfound = true;
                    while (posx  < n )
                    {
                        posx ++;
                        notfound = true;
                        while (startL <= startR  &&  startL + posy < m && startL + posy >= 0 && posx >= 0 && posx < n && a[posx][startL + posy] == '*' )
                        {
                            startL ++;
                            notfound = false;
                        }
                        if(startL == startR + 1  && !notfound) {
                            temp++;
                            startL = -1 * temp;
                            startR = temp;
                        }else {
                            ans += temp;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(ans);


    }
}
