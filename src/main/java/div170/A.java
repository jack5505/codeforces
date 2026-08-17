package div170;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test-- > 0)
        {
            String s = cin.next();
            String t = cin.next();
            if(s.length() < t.length())
                solve(s, t);
            else
                solve(t, s);
        }
    }

    private static void solve(String s, String t)
    {
            int firstAnswer = s.length();
            if(s.length() == 1){
                System.out.println(s.length() + t.length());
                return;
            }
            List<String> ans = new ArrayList<>();
            String temp = s.substring(0, 2);
            ans.add(temp);
            for (int i = 2; i < s.length(); i++)
            {
                temp += s.charAt(i);
                ans.add(temp);
            }
            int answerget = 0;
            for(int i = ans.size() - 1; i >= 0; i --)
            {
                if(t.indexOf(ans.get(i)) == 0)
                {
                        answerget = 1 + t.length() - ans.get(i).length() ;
                        answerget += s.length();
                        break;
                }
            }
            System.out.println(answerget == 0 ? t.length() + s.length() : answerget);
    }
}
