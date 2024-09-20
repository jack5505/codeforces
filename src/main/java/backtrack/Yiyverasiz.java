package backtrack;

import java.util.*;

public class Yiyverasiz {

    public static void main(String[] args) {
        combinationSum(new int[]{2,3,6,7},7).forEach(list ->
                System.out.println(Arrays.toString(list.toArray())));
    }
    public static void solve(int pos, int [] arr, int target,List<Integer> ds,List<List<Integer>> ans){
        if(target == 0){
                ans.add(new ArrayList<>(ds));
        }
        for (int i = pos; i < arr.length ; i++) {
            if(arr[i] > target) break;
            ds.add(arr[i]);
            solve(i + 1,arr,target - arr[i],ds,ans);
            ds.remove(ds.size() - 1);
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < candidates.length ; i++)
        {
            int len = target / candidates[i];
            while (len --  > 0){
                list.add(candidates[i] );
            }

        }
        int n = list.size();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,arr,target,new ArrayList<>(), ans);

        return ans;
    }
}
