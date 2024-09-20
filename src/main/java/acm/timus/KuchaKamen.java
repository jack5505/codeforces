package acm.timus;

import java.util.Arrays;
import java.util.Scanner;

public class KuchaKamen {

    static int summa = 0;
    static int ans = 0;
    static void go(int a[],int n, int pos,int sum,boolean used[]){
            if(pos == n){
                summa = 0;
                for(int i = 0; i < n; i ++){
                    if(!used[i])
                        summa += a[i];
                }
                ans = Math.min(ans, Math.abs(sum - summa));
                return;
            }
            go(a,n,pos + 1,sum,used );
            used[pos] = true;
            go(a,n,pos + 1,sum + a[pos],used);
            used[pos] = false;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a [] = new int[n];
        boolean used [] = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
            summa += a[i];
        }
        ans = summa;
        summa = 0;
        go(a,n,0,0,used);
        System.out.println(ans);
    }
}
