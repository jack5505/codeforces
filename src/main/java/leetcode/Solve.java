package leetcode;

public class Solve {
    public static void main(String[] args) {
        //System.out.println(maxProduct(new int[]{2,3,-2,4}));
//        System.out.println(maxProduct(new int[]{-2,-3,-2,-4}));
    }
    public int maxProduct(int[] nums)
    {
        int sum = nums[0];
        int n = nums.length;
        int ans = 0;
        for(int i = 0 ; i < n ;i ++)
        {
            ans = nums[i];
            for (int j = i + 1; j < n; j++)
            {
                ans = ans * nums[j];
                sum = Math.max(sum, ans);
                if(nums[j] == 0)
                    ans = 0;
            }
        }
        sum = Math.max(ans,sum);
        return sum;
    }


}
