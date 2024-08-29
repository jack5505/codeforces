package div2Epic;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0){
                int n = cin.nextInt();
                int a[] = new int[n];
                int b[] = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = cin.nextInt();
                }
                for (int i = 0; i < n; i++) {
                    b[i] = cin.nextInt();
                }
                solve(a,b);
        }
    }
    public static void solve(int a [], int b [] )
    {
        if(Arrays.equals(a,b)){
            System.out.println("Bob");
            return;
        }
        int n = a.length;
        boolean test = true;
        for(int i = 0 ; i < n;i ++){
            test &= a[i] == b[n - i - 1];
        }
        System.out.println(test ? "Bob" : "Alice");


    }
}
