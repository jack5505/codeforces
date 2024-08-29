package codeforces967;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0)
        {
            int n = cin.nextInt();
            int a [] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = cin.nextInt();
            }
            solve(a,n);

        }

    }
    public static void solve(int a[], int n){
        int cnt [] = new int [101];
        for (int i = 0; i < 101 ; i++) {
            cnt[i] = 0;
        }
        for(int i = 0 ; i < n;i ++){
            cnt[a[i]] ++;
        }
        int mx = 0;
        for (int i = 0; i < 101; i++) {
            mx = Math.max(cnt[i],mx);
        }
        System.out.println(n - mx);


    }
}
