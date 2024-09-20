package yandex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HelloWorld {
    static char a [] = {'a','e','i','o','u'};
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0){
            int n = cin.nextInt();
            solve(n);
        }
    }

    public static void solve(int x)
    {
        StringBuilder ans = new StringBuilder();
        int start = 0;
        Map<Character,Integer> cnt = new HashMap<>();
        while (x -- > 0)
        {
            ans.append(a[start++]);
            if(start % a.length == 0)
            {
                start %= a.length;
            }
        }
        String str = ans.toString();
        for (int i = 0; i <  str.length(); i++) {
            cnt.put(str.charAt(i),cnt.getOrDefault(str.charAt(i),0) + 1);
        }
        ans = new StringBuilder();
        for(Map.Entry<Character,Integer> i : cnt.entrySet())
        {
            Integer value = i.getValue();
            Character key = i.getKey();
            while (value -- > 0){
                ans.append(key);
            }
        }
        System.out.println(ans);

    }
}
