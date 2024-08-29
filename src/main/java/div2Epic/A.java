package div2Epic;

import java.util.*;

public class A {
    static class Position{
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        while (n -- > 0){
            int r,c;
            r = cin.nextInt();
            c = cin.nextInt();
            int k = cin.nextInt();
            solve(r, c, k);
        }
    }
    public static void solve(int n, int m, int k)
    {
//        int a [] [] = new int[ n + 1 ][m + 1];
//        Map<Integer, List<Position>> position = new HashMap<>();
//        int mx = 0;
//        for(int i = 1; i <= 10000; i ++)
//        {
//            for(int i1 = 1 ; i1 <= n ; i1 ++)
//            {
//                for(int j1 = 1 ; j1 <= m; j1 ++)
//                {
//                    if(a[i1][j1] == 0)
//                    {
//                        if(position.get(i) != null)
//                        {
//                           List<Position> lastPositions = position.get(i);
//                           if(checkPostions(lastPositions,i1,j1,k))
//                           {
//                                mx = Math.max(i,mx);
//                                a[i1][j1] = i;
//                                position.get(i).add(new Position(i1,j1));
//                           }
//                        }else{
//                            mx = Math.max(i,mx);
//                            position.put(i,new ArrayList<>());
//                            a[i1][j1] = i;
//                            position.get(i).add(new Position(i1,j1));
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(mx);
        if(n == m && m == k){
            System.out.println( n * n);
        }
        else if(n > k && m > k){
            System.out.println(k * k);
        }
        else{
            System.out.println(Math.min(n,k) * Math.min(m,k));
        }
    }

    private static boolean checkPostions(List<Position> lastPositions, int i1, int j1, int k) {
        boolean check = true;
        for(Position item : lastPositions){
            check &= Math.max(Math.abs(item.x - i1), Math.abs(item.y - j1)) >= k;
        }
        return check;
    }
}
