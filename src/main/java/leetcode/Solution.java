package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Solution {
    public static BiFunction<String,Integer [],Boolean> function = (s, integers) ->
    {
        int len = integers.length;
        if(len != s.length())
            return false;
        int b[] = new int[len];
        int cnt[] = new int[30];
        for(int i = 0 ; i < 30 ;i ++){
            cnt[i] = -1;
        }
        for(int i = 0 ; i < s.length() ;i ++){
            b[i] = cnt[s.charAt(i) - 'a'];
            cnt[s.charAt(i) - 'a'] = i;
        }
        boolean check = true;
        for(int i = 0 ; i < len; i ++){
            check &= b[i] == integers[i];
        }
        return check;
    };

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test    = cin.nextInt();
        while (test-- > 0 ) {
            int n = cin.nextInt();
            Integer a[] = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = cin.nextInt();
            }
            Map<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = 0;
                if (mp.get(a[i]) != null) {
                    x = mp.get(a[i]);
                } else
                    x = -1;
                mp.put(a[i], i);
                a[i] = x;
            }
            int m = cin.nextInt();
            for (int i = 0; i < m; i++) {
                String s = cin.next();
                System.out.println(function.apply(s, a) ? "YES" : "NO");
            }
        }




    }
}
