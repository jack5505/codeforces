package yandex;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test -- > 0){
            int len = cin.nextInt();
            int m = cin.nextInt();
            int q = cin.nextInt();
            Integer b [] = new Integer[m];
            for (int i = 0; i < m; i++) {
                b[i] = cin.nextInt();
            }
            int current = cin.nextInt();
            solve(len,b,current);
        }
    }
    public static void  solve(int len, Integer b[], int current){
        Arrays.sort(b);
        if( current < b[0]){
            System.out.println(b[0] - 1);
        }
        else if(current > b[b.length - 1]){
            System.out.println(len - b[b.length - 1]);
        }
        else{
            int start = b[0];
            int end = b[1];
            int ans = 0;
            while (start < current && current < end)
            {
                start++;
                end--;
                ans ++;
                if(current == start)
                {
                    if(current < end)
                    {
                        current++;
                    }
                }
                else if(current == end)
                {
                    if(current > start)
                    {
                        current--;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
