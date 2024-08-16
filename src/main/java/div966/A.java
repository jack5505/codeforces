package div966;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0){
            int n = cin.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = cin.nextInt();
            }
            solve(a);
        }
    }
    public static void solve(int a []){
        Map<Integer,Boolean> mp = new HashMap<>();
        int n = a.length;
        mp.put(a[0] - 1,true);
        mp.put(a[0] + 1,true);
        boolean noans = false;
        for (int i = 1; i < n ; i++)
        {
            if(mp.getOrDefault(a[i],false)){
                mp.put(a[i] + 1, true);
                mp.put(a[i] - 1, true);
            }else{
                noans = true;
                break;
            }
        }
        System.out.println(noans ? "NO" : "YES");
        }
}
