package backtrack;

import java.util.Scanner;

public class BitmaskPartiion {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        int n = s.length();
        boolean used [] = new boolean[n];

        for(int mask = 0 ; mask < (1 << n) ; mask ++ )
        {
            for(int i = 0; i < n;i ++) {
                used[i] = false;
            }
            String temp = "";
            int exist = 0;
            for(int i = 0 ; i < n ;i ++)
            {
                if((mask & (1 << i)) != 0)
                {
                     exist = 1;
                     temp += s.charAt(i);
                     used[i] = true;
                }else {
                    if(exist == 1)
                        break;
                }
            }
            if(isPalindrome(temp)){
                System.out.println(temp);
            }
        }
    }

    public static boolean isPalindrome(String name){
        boolean test = true;
        for (int i = 0; i < name.length(); i++) {
            test &= name.charAt(i) == name.charAt(name.length() - 1 - i);
        }
        return test;
    }
}
