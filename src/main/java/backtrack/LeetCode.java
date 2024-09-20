package backtrack;

import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        combinationSum2(new int[]{10,1,2,7,6,1,5},8);
    }
    public static void solve(int[] a,int pos,int target,List<Integer> ds,List<List<Integer>> ans){
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = pos; i < a.length; i++) {
            if (i > pos && a[i] == a[i - 1]) continue;
            if (a[i] > target) break;

            ds.add(a[i]);
            solve( a, i + 1, target - a[i],ds, ans);
            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(candidates);
            solve(candidates,0,target, new ArrayList<>(),ans);
            return ans;
    }
}
