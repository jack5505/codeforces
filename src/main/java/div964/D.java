package div964;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while (test-- > 0){
            String s = cin.next();
            String t = cin.next();
            solve(s,t);

        }
    }

    private static void solve(String s, String t) {
        StringBuilder ans = new StringBuilder();
        int i;
        int cnt = 0;
        boolean used [] = new boolean[t.length() + 1];
        for( i = 0; i < s.length(); i ++)
        {
            if(s.charAt(i) == '?')
                cnt ++;
        }
        int start = 0;
        for(i = 0 ; i < Math.min(s.length() , t. length()) ;i ++)
        {
            if(s.charAt(i) == t.charAt(start)){
                start++;
            }else{
                if(s.charAt(i) == '?')
                    start++;
            }
        }

        for(; i < s.length(); i ++){
            if(s.charAt(i) == '?')
                start++;
            if(start < t.length() && s.charAt(i) == t.charAt(start))
                start++;
        }
        if(start >= t.length())
        {
            start = 0;
            System.out.println("YES");
            for(i = 0 ; i < s.length() ;i ++)
            {
                if(s.charAt(i) != '?')
                {
                    if(s.charAt(i) == t.charAt(start))
                    {
                        if(start < t.length() - 1)
                            start++;
                    }
                    ans.append(s.charAt(i));
                }
                else{
                     ans.append(t.charAt(start));
                     if(start < t.length() - 1)
                         start++;
                }
            }
            System.out.println(ans);
        }else{
            System.out.println("NO");
        }





        //System.out.println(ans);


    }

}
