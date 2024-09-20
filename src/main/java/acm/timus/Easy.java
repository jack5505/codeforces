package acm.timus;

import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String zamoq  = cin.next();
        String zamoq2 = cin.next();
        int start = 0;
        int cnt = 0;
        int ans = 0;
        while (cnt <= 9999)
        {

            if(cnt % 2 == 0){
                if(makeItZero(start).equals(zamoq)){
                    ans++;
                    break;
                }
            }else{
                if(makeItZero(start).equals(zamoq2)){
                    ans ++;
                    break;
                }
            }
            start ++;
            cnt++;
        }
        System.out.println( ans > 0 ? "yes" : "no");
    }
    public static String makeItZero(int x){
            StringBuilder ans = new StringBuilder();
            while (x > 0){
                ans.append(x % 10);
                x /= 10;
            }
            while (ans.length() < 4){
                ans.append("0");
            }
            return ans.reverse().toString();
    }


}
