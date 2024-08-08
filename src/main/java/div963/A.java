package div963;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0){
            solve(cin);
        }
    }

    private static void solve(Scanner cin) {
        int n = cin.nextInt();
        String name = cin.next();
        int ans = 0;
        int cnt [] = new int[4];
        for(int i = 0 ; i < name.length() ;i ++){
            if(name.charAt(i) == '?')
                continue;
            cnt[name.charAt(i) - 'A'] ++;
        }
        System.out.println(cnt[0]);
        ans += Math.min(cnt[0],n);
        ans += Math.min(cnt[1],n);
        ans += Math.min(cnt[2],n);
        ans += Math.min(cnt[3],n);
        System.out.println(ans);

    }

}


