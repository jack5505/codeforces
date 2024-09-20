package leetCodeWindowSliding;

import java.util.*;

public class C {
    public static void main(String[] args) {
        partitionLabels("ababcbacadefegdehijhklij").forEach(System.out::println);
        partitionLabels("eccbbbbdec").forEach(System.out::println);
    }
    public  static List<Integer> partitionLabels(String s) {
            int n = s.length();
            int position [] = new int[ n ];
            for (int i = 0; i < n ; i++) {
                position[i] = -1;
            }
            Map<Character,Integer> mp = new HashMap<>();
            for (int i = n - 1; i >= 0 ; i --)
            {
                   if(mp.getOrDefault(s.charAt(i),0) == 0){
                        position[i] = i;
                        mp.put(s.charAt(i),i);
                   }else{
                       position[i] = mp.get(s.charAt(i));
                   }
            }
            int mx = 0;
            int cnt = 0;
            List<Integer> ans = new ArrayList<>();
            for(int i = 0 ; i < n; i ++)
            {
                mx = Math.max(mx,position[i]);
                cnt ++;
                if(mx == i){
                    ans.add(cnt);
                    cnt = 0;
                }
            }

            return ans;
    }
}
