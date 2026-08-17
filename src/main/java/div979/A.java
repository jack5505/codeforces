package div979;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n ; i++) {
                a[i] = scanner.nextInt();
            }
            solve(n,a);
        }
    }
    public static void solve(int n,int a []){
        int mx = 0 ;
        int mn = 1001;
        for (int i = 0; i < n; i++) {
            mx = Math.max(a[i],mx);
            mn = Math.min(mn,a[i]);
        }
        System.out.println((mx - mn) * (n - 1));
    }
}
