package yandex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SolveAgain {
    public static int a[];
    public static List<Long> all = new ArrayList<>();
    public static void solve(int len,int i){
        if(i == len){
            StringBuilder ans = new StringBuilder();
            for (int j = 0; j < len; j++) {
                ans.append(a[j]);
            }
            all.add(Long.parseLong(ans.toString()));
            return;
        }
        a[i] = 4;
        solve(len, i + 1);
        a[i] = 7;
        solve(len,i + 1);
    }
    public static void main(String[] args) {
        a = new int[10];
        for(int i = 1 ; i <= 10 ;i ++){
            solve(i,0);
        }
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for(int i = 0 ; i < all.size() ;i ++)
        {
            if(all.get(i) >= n && checkHappyDigit(all.get(i)))
            {
                System.out.println(all.get(i));
                return;
            }
        }
    }
    public static boolean checkHappyDigit(Long happy){
        int seven = 0;
        int four = 0;
        while (happy > 0){
            long last = happy % 10;
            if(last == 7)
                seven++;
            else
                four++;
            happy /= 10;
        }
        return seven == four;
    }
}
