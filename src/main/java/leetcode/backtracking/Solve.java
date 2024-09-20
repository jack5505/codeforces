package leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solve {
    public  int n;
    public  Set<String> ans = new HashSet<>();


    public  void go(String temp,int n, String name){
        if(temp.length()  == n){
            ans.add(temp);
        }

        if(temp.length() < n){
            go(temp + Character.toLowerCase(name.charAt(temp.length())),n,name);
        }
        if(temp.length() < n) {
            go(temp + Character.toUpperCase(name.charAt(temp.length())),n,name);
        }
    }
    public   List<String> letterCasePermutation(String s) {
        n = s.length();
        go("",n,s);
        return new ArrayList<>(ans);
    }
}
