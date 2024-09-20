package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PalindromPartitioninBackTrack {


    public static void test(String temp, int pos, List<String> l,List<List<String>> list )
    {
        if(pos == temp.length())
        {
            System.out.println(Arrays.toString(l.toArray()));
            return;

        }
        for(int i = pos ; i < temp.length(); i ++)
        {
            if(isPalindrome(temp,pos,i)) {
                l.add(temp.substring(pos,i + 1));
                test(temp, i + 1, l, list);
                l.remove(l.size() - 1);
            }

        }

    }

    public static void main(String[] args) {
            List<List<String>> list = new ArrayList<>();
            Scanner cin = new Scanner(System.in);
            String s = cin.next();
            int n = s.length();
            List<String> list1 = new ArrayList<>();
            test(s,0,list1,list);
            list.forEach(list2 -> System.out.println(Arrays.toString(list2.toArray())));

    }
    public static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
