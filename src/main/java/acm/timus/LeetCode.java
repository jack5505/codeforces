package acm.timus;

import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }

    public static String removeDuplicateLetters(String s) {
        int [] lastSeen = new int[30];
        for (int i = 0; i < s.length(); i ++) {
            lastSeen[s.charAt(i) - 'a'] = i;
        }
        boolean [] seen = new boolean[30];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            int curr = s.charAt(i) - 'a';
            if(seen[curr])continue;
            while (!stack.isEmpty() && curr < stack.peek() && i < lastSeen[stack.peek()]){
                seen[stack.pop()] = false;
            }
            stack.add(curr);
            seen[curr] = true;
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()){
            ans.append(Character.toChars(stack.pop() + 'a'));
        }
        return ans.reverse().toString();
    }
    public int longestPalindrome(String s) {
        int cnt [] = new int[256];
        for(Character i : s.toCharArray()){
            cnt[i] ++;
        }
        int suma = 0;
        Arrays.sort(cnt);
        for(int i = 255; i > 0 ;i --){
            if(cnt[i] >= 1 && cnt[i] % 2 == 0){
                suma += cnt[i];
            }
        }
        return suma;

    }
}
