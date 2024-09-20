package backtrack;

public class Bitmask {
    public static void main(String[] args) {
        int a [] = new int[]{1,2,3,4,5,6,7,8,9,10};
        int n = a.length;
        for(int mask = 0 ; mask < (1 << n) ; mask ++)
        {
            for(int i = 0 ; i < n ;i ++)
            {
                    if((mask & (1 << i)) != 0)
                    {
                        System.out.print(a[i] + " ");
                    }
            }
            System.out.println();
        }
    }
}
