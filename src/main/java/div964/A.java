package div964;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int ans = 0;
        while (n -- > 0){
            int t = cin.nextInt();
            ans = 0;
            while (t > 0){
                ans += t % 10;
                t /=10;
            }
            System.out.println(ans);
        }
    }
}
