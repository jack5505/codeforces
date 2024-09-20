package backtrack;

public class BitmaskLearn {
    public static void main(String[] args) {
        String s = "abcd";
        int n = s.length();
        for(int mask = 0 ; mask < (1 << n); mask ++)
        {
            int exist = 0;
            for(int i = 0; i < s.length(); i ++)
            {
                if((mask & (1 << i)) != 0)
                {
                    exist = 1;
                    System.out.print(s.charAt(i));
                }else{
                    if(exist== 1)
                         break;
                }
            }
            System.out.println();
        }
    }
}
