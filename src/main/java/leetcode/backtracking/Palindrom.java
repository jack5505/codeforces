package leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Palindrom {
    public static List<List<String>> ans = new ArrayList<>();

    public static void go(String temp, int n, char a [],int pos){
        if(pos == n){
            if( checkPalindrome(temp) ){
                List<String> a1 = new ArrayList<>();
                a1.add(temp);
                ans.add(a1);
            }
            return;
        }
        go(temp,n,a,pos + 1);
        go(temp + a[pos],n,a,pos + 1);

    }
    public static List<List<String>> partition(String s) {
        int n = s.length();
        char a [] = s.toCharArray();
        go("",n,a,0);
        return ans;
    }

    public static boolean checkPalindrome(String s){
        boolean check = true;
        for (int i = 0; i < s.length(); i++) {
                check &= s.charAt(i) == s.charAt(s.length() - 1 - i);
        }
        return check;
    }
}
