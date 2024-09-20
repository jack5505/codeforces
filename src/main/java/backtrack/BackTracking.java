package backtrack;

import java.util.*;

public class BackTracking {
    public static   Set<List<Integer>> filter = new HashSet<>();
    public static void main(String[] args) {
            //permuteUnique(new int[]{1,1,2});
            permuteUnique(new int[]{1,-1,1,2,-1,2,2,-1});
    }
    public static void test(int a[],int left, int right,List<List<Integer>> ans){
        if(left == right){
            //System.out.println(Arrays.toString(a));
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < right; i++) {
                list.add(a[i]);
            }
            if(!filter.contains(list)){
                ans.add(list);
            }
            filter.add(list);
        }

        for(int i = left ;i < right ;i ++){
            int temp = a[i];
            a[i] = a[left];
            a[left] = temp;
            test(a,left + 1, right,ans);
            temp = a[i];
            a[i] = a[left];
            a[left] = temp;
        }

    }
    public static   List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        test(nums,0,nums.length,ans);
        return ans;
    }
}
