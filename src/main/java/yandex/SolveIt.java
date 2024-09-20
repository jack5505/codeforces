package yandex;

import java.util.ArrayList;
import java.util.List;

public class SolveIt {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abvba"));
    }
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int len = arr.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len && n > 0; i++)
        {
                if(arr[i] != 0)
                {
                    list.add(arr[i]);
                    n --;
                }
                else
                {
                    list.add(0);
                    n--;
                    if(n >= 1) {
                       list.add(0);
                       n--;
                    }
                }
        }
        for (int i = 0; i < list.size() ; i++) {
            arr[i] = list.get(i);
        }

    }

    public static boolean validPalindrome(String s)
    {
            boolean find = true;
            if(s.length() % 2 != 0)
            {
                for (int i = 0; i <  s.length() ; i++) {
                    find &= (s.charAt(i) == s.charAt(s.length() - i - 1));
                }
            }else{

            }
            return find;
    }
}
