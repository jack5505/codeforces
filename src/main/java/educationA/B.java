package educationA;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0){
            int l1,r1;
            int l2,r2;
            l1 = cin.nextInt();
            r1 = cin.nextInt();
            l2 = cin.nextInt();
            r2 = cin.nextInt();
            solve(l1,r1,l2,r2);
        }
    }
    public static void solve(int l1, int r1, int l2, int r2){
            if(l1 == l2 && r1 == r2){
                System.out.println(r1 - l1);
                return;
            }
            else if(r1 < l2){
                System.out.println(1);
                return;
            }
            else if(r2 < l1){
                System.out.println(1);
                return;
            }
                    int lmin = Math.min(l1,l2);
                    int lmax = Math.max(l1,l2);
                    int rmin = Math.min(r1,r2);
                    int rmax = Math.max(r1,r2);
                    int ans = Math.abs(lmax - rmin);
                    if(lmax != 1 && lmax != lmin)
                        ans ++;
                    if(rmin != 100 && rmin != rmax)
                        ans ++;
                    System.out.println(ans);
    }
}
