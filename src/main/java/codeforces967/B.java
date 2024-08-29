package codeforces967;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
            int n = cin.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n ; i++) {
                a[i] = cin.nextInt();
            }
            solve(a);
        }
    public static void solve(int a[])
    {

            for(int i : a)
            {
                if (i % 2 == 0) {
                    System.out.println(-1);
                } else {
                    System.out.print(1 + " ");
                    int cnt = 1;
                    while (cnt < i ) {
                        System.out.print((cnt + 2) + " " + (cnt + 1) + " ");
                        cnt += 2;
                    }
                    System.out.println();
                }
            }

    }
}
