package leetcode;

public class Greedy {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2,3,4,5,6}));
    }

    public static int maxProfit(int[] prices) {
        int suma = 0;
        int n = prices.length;
        for (int i = 0; i < n - 1 ; i++) {
            int temp = prices[i + 1] - prices[i];
            if(temp > 0)
                suma += temp;
        }
        System.out.println(suma);
        return suma;
    }
}
