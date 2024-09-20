package backtrack;

import java.util.*;

public class PalindromPartiioning {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        partition(s).forEach(list -> {
            System.out.println(Arrays.toString(list.toArray()));
        });
    }
    public static List<List<String>> partition(String s)
    {
        int n = s.length();
        List<List<String>> ans = new ArrayList<>();
        Set<List<String>> filter = new HashSet<>();
        for(int i1= 1 ; i1 <= n ; i1 ++)
        {
            for (int i = 0; i < n; i++)
            {
                String test = "";
                int item = i1;
                List<String> get = new ArrayList<>();
                List<Integer> path = new ArrayList<>();
                Set<Integer> visited = new HashSet<>();
                for (int j = i; j < n; j++)
                {
                    test += s.charAt(j);
                    item--;
                    path.add(j);
                    if(item == 0)
                    {
                        if(isPalindrome(test))
                        {
                            get.add(test);
                            for(Integer p : path){
                                visited.add(p);
                            }
                        }
                        item = i1;
                        test = "";
                        path.clear();
                    }
                }
                if(get.size() != 0)
                {
                    List<String> preAnswer = new ArrayList<>();
                    int start = 0;
                    for(int i2 = 0; i2 < n ;i2 ++)
                    {
                        if(!visited.contains(i2))
                        {
                            preAnswer.add(String.valueOf(s.charAt(i2)));
                        }else{
                            if(start < get.size())
                                preAnswer.add(get.get(start++));
                        }
                    }
                    if(!filter.contains(preAnswer))
                        ans.add(preAnswer);
                    filter.add(preAnswer);
                }

            }
        }


        return ans;
    }
    public static boolean isPalindrome(String name){
        boolean test = true;
        for (int i = 0; i < name.length(); i++) {
            test &= name.charAt(i) == name.charAt(name.length() - 1 - i);
        }
        return test;
    }
}
