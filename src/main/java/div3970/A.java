package div3970;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0){
            int a = cin.nextInt();
            int b = cin.nextInt();
            solve(a,b);
        }
    }
    public static void solve(int bir, int ikk)
    {
        if(bir % 2 != 0){
            System.out.println("NO");
        }else{
            if(ikk == 0 || bir == 0){
                int mx = Math.max(bir,ikk);
                System.out.println(mx % 2 == 0 ? "YES" : "NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
