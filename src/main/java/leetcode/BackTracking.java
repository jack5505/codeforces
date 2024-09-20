package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class BackTracking {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int n;
    public static int tr;
    public static int a[];
    public static void solve(int pos, int sum,List<Integer> list)
    {
            if(pos == n)
            {
                if(sum == tr){
                    list.forEach(System.out::println);
                }
                return;
            }
            solve(pos + 1,sum,list);
            list.add(a[pos]);
            solve(pos + 1, sum + a[pos],list);


    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
         n = candidates.length;
         tr = target;
         a = candidates;
         solve(0,0,new ArrayList<>());
         return new ArrayList<>();
    }
    public boolean hasGroupsSizeX(int[] deck) {
        int [] cnt = new int[10000];
        Arrays.stream(deck).forEach(value -> {
            cnt[value]++;
        });
        Set<Integer> set = new HashSet<>();
        for(int i = 10000 ; i >= 1 ; i--)
        {
            if(cnt[i] != 0 && cnt[i] > 1)
            {
                set.add(cnt[i]);
            }
        }
        return set.size() == 1;

    }
    public static String reverseOnlyLetters(String s) {
        StringBuilder builder = new StringBuilder();
        for(char i : s.toCharArray()){
            if(Character.isAlphabetic(i)){
                builder.append(i);
            }
        }
        int last = builder.length();
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if(Character.isAlphabetic(s.charAt(i))){
                ans.append(builder.charAt(last));
                last --;
            }else
                ans.append(s.charAt(i));
        }

        return ans.toString();
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int suma = 0;
        int mx = 0;
        while (left < right){
            suma = Math.min(height[left],height[right]) * ( right - left);
            mx = Math.max(mx,suma);
            if(height[left] < height[right])
                left++;
            else right--;
        }
        return mx;
    }

}
