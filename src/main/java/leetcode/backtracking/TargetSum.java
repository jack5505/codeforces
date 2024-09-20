package leetcode.backtracking;

public class TargetSum {
    public int ans;
    public  void go(int [] nums, int len, int target, int pos,int summa)
    {
        if(len == pos)
        {
            if(target == summa)
            {
                ans ++;
            }
            return;
        }
        go(nums,len,target,pos + 1, summa + nums[pos]);
        go(nums,len,target,pos + 1, summa - nums[pos]);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        go(nums,n,target,0,0);
        return ans;
    }

}
