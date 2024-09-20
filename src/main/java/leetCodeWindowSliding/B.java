package leetCodeWindowSliding;

public class B {
    public static void main(String[] args) {
        // System.out.println(characterReplacement("ABCAAA",1));
        //System.out.println(characterReplacement("AABABBA",1));
        // System.out.println(characterReplacement("ABAB",2));
        //System.out.println(characterReplacement("ABABABABABAB",2));
        //System.out.println(characterReplacement("AAABBBBAAABAAAABBAA", 2));
        //System.out.println(characterReplacement("IMNJJTRMJEGMSOLSCCQICIHLQIOGBJAEHQOCRAJQMBIBATGLJDTBNCPIFRDLRIJHRABBJGQAOLIKRLHDRIGERENNMJSDSSMESSTR", 2));
//        System.out.println(characterReplacement("IMNJJTRMJEGMSOLSCCQICIHLQIOGBJAEHQOCRAJQMBIBATGLJDTBNCPIFRDLRIJHRABBJGQAOLIKRLHDRIGERENNMJSDSSMESSTR", 2));
        //System.out.println(characterReplacement("JSDSSMESSTR", 2));
        System.out.println(characterReplacement("MJSDSSMESSTR", 2));
    }

    public static int characterReplacement(String s, int k) {
        int ans = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            i= 'S';
            int temp = k;
            int cnt = 0;
            int l = 0;
            for (int j = 0; j < s.length(); j++)
            {
                if (s.charAt(j) == i)
                {
                    cnt++;
                }
                else
                {
                    if (temp >= 1)
                    {
                        temp--;
                        cnt++;
                    }
                    else
                    {
                        while (temp == 0)
                        {
                            if(s.charAt(l) != i)
                                temp ++;;
                            l ++;
                            cnt--;
                        }
                        temp --;
                        cnt ++;
                    }
                }
                ans = Math.max(ans, cnt);
            }
        }
        return ans;
    }
}
