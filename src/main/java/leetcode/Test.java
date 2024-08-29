package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }
       // System.out.println(singleNumber(a));
        System.out.println(4 << 2);
        System.out.println(7 >> 4 & 1);
    // 74130003
        // 2183579
    }


    public static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < 32 ;i ++){
            int sum = 0;
            for(int item: nums){
                sum += item >> i & 1;
            }
            System.out.println(sum + " " + sum % 3);
            ans |= (sum % 3) << i;
        }
        return ans;
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int N = (int) 1e5;
        int pos [] = new int[N];
        int b [] = new int[n];
        for (int i = 0; i < N; i++) {
            pos[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            b[i] = pos[prices[i]];
            pos[prices[i]] = i;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(prices[i] +" " + b[i]);
        }

        return 1;
    }
}
