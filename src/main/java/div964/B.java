package div964;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner  cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t -- > 0)
        {
            int n = 4;
            int ans = 0;
            int a [] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = cin.nextInt();
            }

                ans ++;
            //System.out.println(ans);

            System.out.println(ans);

        }
    }
    public static int win(int a1, int b1){
        if(a1 > b1)
            return 1;
        else if(a1 < b1)
            return  -1;
        else
            return 0;
    }
    public static boolean greaterWin(int a1, int b1){
        return a1 > b1;
    }
    public static boolean eqaul(int a1 ,int b1){
        return a1 == b1;
    }
}
